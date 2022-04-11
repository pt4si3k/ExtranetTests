package tests.LoginStudent;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pages.LoginPageStudent;
//import org.testng.AfterClass;
//import org.testng.BeforeClass;
//import org.testng.Test;



import java.util.concurrent.TimeUnit;


public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup() {
////
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://portal3-dev.wsb.pl");

    }
}
//    @AfterClass
//    public static void teardown () {
//        driver.quit();
//    }}
////}