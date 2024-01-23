import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

    WebDriver driver ;
    @BeforeTest
    public void setUpWebdriverManager(){
        WebDriverManager.firefoxdriver().setup();
        driver =  new FirefoxDriver();
    }

    @Test
    public void launchBrowser(){
        driver.get("https://www.google.com");
        System.out.println("browser opened");

    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
