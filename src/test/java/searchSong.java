import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchSong {
    WebDriver driver;

    String baseurl;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseurl="https://www.youtube.com";
        driver.manage().window().maximize();

    }

    @Test
    public void search() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.id("search")).sendKeys("go down de");
        Thread.sleep(7000);

    }
    @After
    public void finish(){driver.quit();}


}
