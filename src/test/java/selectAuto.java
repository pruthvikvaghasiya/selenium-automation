import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.bcel.generic.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectAuto {
    WebDriver driver;
    String bseUrl;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        bseUrl ="https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.get(bseUrl);
    }

    @Test
    public void myTest() throws InterruptedException {

        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(4000);
    }

    @Test
    public void yTest2 () throws InterruptedException {
        driver.findElement(By.className("inputs")).sendKeys("pruthvik");
        Thread.sleep(3000);
    }
    @After
    public void Down(){
        driver.quit();
    }
}
