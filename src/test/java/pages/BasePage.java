package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}