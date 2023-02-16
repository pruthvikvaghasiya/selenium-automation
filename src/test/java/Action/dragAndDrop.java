package Action;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    WebDriver driver;

    String baseurl;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseurl="https://jqueryui.com/droppable/";
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void search() throws InterruptedException {

        driver.switchTo().frame(0);
        WebElement fromele = driver.findElement(By.id("draggable"));
        WebElement toele = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(fromele,toele).build().perform();
        Thread.sleep(2000);

    }
    @After
    public void finish() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
