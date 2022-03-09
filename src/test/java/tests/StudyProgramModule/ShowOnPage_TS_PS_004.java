package tests.StudyProgramModule;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.LoginPageStudent;
import pages.StudyModule;
import pages.StudyProgramModule;
import tests.LoginStudent.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShowOnPage_TS_PS_004 extends BaseTest {


    LoginPageStudent loginPageStudent = new LoginPageStudent(BaseTest.driver);
    StudyModule studymodule = new StudyModule(BaseTest.driver);
    StudyProgramModule studyProgramModule = new StudyProgramModule(BaseTest.driver);


        @Test
    public void step1_LoginAsStudent(){
        loginPageStudent = new LoginPageStudent(driver);
        loginPageStudent.loginAsStudent("pzx95020@student.wsb.poznan.pl", "extranet30");
    }

    @Test
    public void step2_EnterStudyModule() {
        studymodule = new StudyModule(driver);
        studymodule.enterStudyModule();
    }

    @Test
    public void step3_EnterStudyProgramModule() {
        studyProgramModule = new StudyProgramModule(driver);
        studyProgramModule.enterStudyProgramModule();
    }

    @Test
    public void step4_Show25From10() {
        studyProgramModule = new StudyProgramModule(driver);
        studyProgramModule.clickShowOnPage();
        studyProgramModule.showTwentyFiveOnPage();
        Assert.assertEquals("numberOfRecords25","numberOfRecords25");
    }

    @Test
    public void step5_Show50From25() {
        studyProgramModule = new StudyProgramModule(driver);
        studyProgramModule.clickShowOnPage();
        studyProgramModule.showFiftyOnPage();
    }

        @Test
        public void step6_BackTo25from50 () {
            studyProgramModule = new StudyProgramModule(driver);
            studyProgramModule.clickShowOnPage();
            studyProgramModule.showTwentyFiveFrom50();
        }
//
            @Test
        public void step7_Backto10from25 () {
                studyProgramModule = new StudyProgramModule(driver);
                studyProgramModule.clickShowOnPage();
                studyProgramModule.showTenOnPage();
            }

            @Test
            public void step8_Show50from10 () {
                    studyProgramModule = new StudyProgramModule(driver);
                    studyProgramModule.clickShowOnPage();
                    studyProgramModule.showTenOnPage();
                    studyProgramModule.clickShowOnPage();
                    studyProgramModule.showFiftyOnPage();

            }
            @Test
            public void step9_BackTo10From50 () {
                studyProgramModule = new StudyProgramModule(driver);
                studyProgramModule.clickShowOnPage();
                studyProgramModule.showTenOnPage();

            }
            }
//
