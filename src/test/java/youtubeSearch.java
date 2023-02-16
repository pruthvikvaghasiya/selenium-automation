import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class youtubeSearch {
    WebDriver driver;
    String baseurl;
    String songName = "Shape of You";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = "http://youtube.com/";
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void search() throws InterruptedException {
        // Alert alert = driver.switchTo().alert();
        //   alert.accept();

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys(songName);
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(4000);


    /*# Get the first video link
                link = driver.find_elements_by_xpath("//a[@id='video-title']")[0]
        link.click()*/
    }

    @After
    public void finish() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
