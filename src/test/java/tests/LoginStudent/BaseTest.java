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

//
//
//import org.junit.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.LoginPageStudent;
//import pages.StudyModule;
//
//import java.util.concurrent.TimeUnit;
//
//
//public class BaseTest {
//
//    private static WebDriver driver;
//    private static WebDriverWait wait;
//    LoginPageStudent loginPageStudent;
//    LoginPageStudent loginPageStudent2;
//    StudyModule studymodule;
//
//    @BeforeClass
//    public static void setUp() {
//
//    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//    driver.get("https://portal3-dev.wsb.pl");
//}
//
//    @Test()
//    public void loginAsStudent() {
//        loginPageStudent = new LoginPageStudent(driver);
//        loginPageStudent.loginAsStudent("pzx95020@student.wsb.poznan.pl", "extranet30");
////        studymodule = new StudyModule(driver);
////        studymodule.enterStudyModule();
////        Assert.assertTrue(studymodule.isOpened);
//
//    }
//
//    @Test()
//    public void studyModule() {
////        loginPageStudent2 = new LoginPageStudent(driver);
////        loginPageStudent2.loginAsStudent("pzx95020@student.wsb.poznan.pl", "extranet30");
//        studymodule = new StudyModule(driver);
//        studymodule.studyButton.click();
//    }
//    @After
//    public void tearDown() {
//        driver.close();
//    }}
//
//
//
////    @Test
////    public void testLoginWithProperCredentials() {
////        LoginPage loginPage = new LoginPage(driver);
////        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
////        Assert.assertEquals("Automated Tester", loginPage.getLoggedUsername());
////    }
////    @AfterClass
////    public void tearDown() {
////        driver.quit();
////    }
//}
//
//}
public class BaseTest {

    LoginPageStudent loginPageStudent = new LoginPageStudent(driver);
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup () {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://portal3-dev.wsb.pl");

    }

//    @AfterClass
//    public static void teardown () {
//        driver.quit();
//    }
}