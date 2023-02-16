import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class switchIFrame {
    WebDriver driver;
    String baseurl;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseurl="https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void search() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement searchbox = driver.findElement(By.cssSelector("input#search"));
        searchbox.sendKeys("python");
        searchbox.sendKeys(Keys.ENTER);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);

    }
    @After
    public void finish() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}

