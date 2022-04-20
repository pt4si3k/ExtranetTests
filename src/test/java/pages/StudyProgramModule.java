package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudyProgramModule {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]")
    public WebElement studyProgramButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/button")
    public WebElement clickCourseButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/button")
    public WebElement clickCourse2Button;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/table")
    public WebElement semesterInformationButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div/div")
    public WebElement clickNumberButton;
    @FindBy(xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/button"))
    public WebElement anotherCourseButton;
    @FindBy(xpath = "//*[@id=\"list-item-130-0\"]")
    public WebElement showTenOnPageButton;
    @FindBy(xpath = ("//*[@id=\"list-item-130-1\"]"))
    public WebElement showTwentyFiveOnPageButton;
    @FindBy(xpath = ("//*[@id=\"list-item-130-2\"]"))
    public WebElement showFiftyOnPageButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/button")
    public WebElement informationCourseRollDownButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/button")
    public WebElement anotherCourseInformationButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody")
    public WebElement numberOfRecords25;
    @FindBy(xpath = ("//*[@id=\"list-item-130-1\"]/div"))
    public WebElement showTwentyFiveBackButton;


    @FindBy(xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/nav/ul/li[3]/button"))
    public WebElement secondPageButton;
    @FindBy(xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]"))
    public  WebElement visibilityOfSecondPageInformation;
    @FindBy(xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/nav/ul/li[2]/button"))
    public WebElement firstPageButton;
    @FindBy (xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/nav/ul/li[4]/button"))
    public WebElement nextPageButton;
    @FindBy (xpath = ("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/nav/ul/li[1]/button"))
    public WebElement previousPageButton;

    public StudyProgramModule(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void waitUntilStudyProgramVisibility() {
        WebElement element = new WebDriverWait(driver, (200))
                .until(ExpectedConditions.elementToBeClickable(studyProgramButton));
        element.isEnabled();
    }

    public void enterStudyProgramModule() {
        this.studyProgramButton.click();
    }

    public void clickCourse() {
        WebElement element = new WebDriverWait(driver, (200))
                .until(ExpectedConditions.elementToBeClickable(clickCourseButton));
        element.click();
//
//        this.clickCourseButton.click();
    }

    public void clickCourse2() {
        this.clickCourse2Button.click();
    }

    public void semesterInformation() {
        this.semesterInformationButton.isDisplayed();

    }

    public void informationCourseRollDown() {
        this.informationCourseRollDownButton.isDisplayed();
    }

    public void clickShowOnPage() {
        this.clickNumberButton.click();

    }

    public void anotherCourse() {
        this.anotherCourseButton.click();
    }

    public void showTenOnPage() {
        WebElement element4 = new WebDriverWait(driver, (80))
                .until(ExpectedConditions.elementToBeClickable((showTenOnPageButton)));
        element4.click();

    }

    public void showTwentyFiveOnPage() {
        WebElement element2 = new WebDriverWait(driver, (80))
                .until(ExpectedConditions.elementToBeClickable((showTwentyFiveOnPageButton)));
        element2.click();

    }
    public void showTwentyFiveFrom50(){
        WebElement element3 = new WebDriverWait(driver, (80))
                .until(ExpectedConditions.elementToBeClickable((showTwentyFiveBackButton)));
        element3.click();

    }

    public void showFiftyOnPage() {
        WebElement element3 = new WebDriverWait(driver, (80))
                .until(ExpectedConditions.elementToBeClickable((showFiftyOnPageButton)));
        element3.click();
    }

    public void anotherCourseInformation() {
        this.anotherCourseInformationButton.isDisplayed();
    }
    public void checkNumberOfNumbers(){
        this.numberOfRecords25.isDisplayed();


}
public void clickSecondPageButton(){
    this.secondPageButton.click();
}
public void clickFirstPageButton(){
        this.firstPageButton.click();
}
public void clickNextPageButton(){
        this.nextPageButton.click();
}
public void clickPreviousPageButton(){
        this.previousPageButton.click();
}

}

