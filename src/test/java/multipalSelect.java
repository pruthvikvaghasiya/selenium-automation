import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipalSelect {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl="https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void mulselect() throws InterruptedException {
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(element);

        select.selectByIndex(0);
        Thread.sleep(3000);

    }
    @After
    public void end(){driver.quit();}
}
