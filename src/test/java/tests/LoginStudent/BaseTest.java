package tests.LoginStudent;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup() {

        ChromeOptions options = new ChromeOptions();

        String[] chromeOptions = System.getProperty("webdriver.chrome.options").split(" ");
        if(!System.getProperty("webdriver.chrome.options").isEmpty() && chromeOptions.length>0){
            options.addArguments(chromeOptions);
        }

        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://portal3-dev.wsb.pl");
    }
}
