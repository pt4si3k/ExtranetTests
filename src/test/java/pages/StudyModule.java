package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyModule extends LoginPageStudent {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[2]/div[2]/div[1]/div[1]/button/span/i")
    public WebElement studyButton;

    public StudyModule(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterStudyModule() {
        this.studyButton.click();}



}