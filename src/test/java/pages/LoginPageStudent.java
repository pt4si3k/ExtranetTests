package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageStudent extends BasePage {
   WebDriver driver;
    @FindBy(name = "username2")
    private WebElement login;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(id = "login_button")
    private WebElement confirm;
    @FindBy (xpath = "//*[@id=\"app\"]/div/div[2]/div")
    private WebElement dashboard;


    public LoginPageStudent(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginAsStudent(String email, String password) {
        this.login.click();
        this.login.sendKeys(email);
            this.password.click();
            this.password.sendKeys(password);
            confirm.click();

//        WebElement element= new WebDriverWait(driver, (40))
//               .until(ExpectedConditions.elementToBeClickable(dashboard));
//
//        Assert.assertEquals("Panel",element.getText());


    }}
