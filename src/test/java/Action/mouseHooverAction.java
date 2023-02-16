package Action;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.wml.WMLSelectElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class mouseHooverAction {
    WebDriver driver;

    String baseurl;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseurl="https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void search() throws InterruptedException {

        WebElement mainElement = driver.findElement(By.id("mousehover"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainElement).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mouse-hover-example-div\"]/div/fieldset/div/div/a[1]")).click();

    }
    @After
    public void finish() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
