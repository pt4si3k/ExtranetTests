package tests.StudyProgramModule;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.LoginPageStudent;
import pages.StudyModule;
import pages.StudyProgramModule;
import tests.LoginStudent.BaseTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Pagination_TS_PS_003 extends BaseTest {


    StudyModule studymodule = new StudyModule(BaseTest.driver);
    StudyProgramModule studyProgramModule = new StudyProgramModule(BaseTest.driver);
    LoginPageStudent loginPageStudent = new LoginPageStudent(BaseTest.driver);

    @Test
    public void step1_LoginAsStudent() {
        loginPageStudent.loginAsStudent("pzx95020@student.wsb.poznan.pl", "extranet30");
    }

    @Test
    public void step2_EnterStudyModule() {
        studymodule.enterStudyModule();
    }

    @Test
    public void step3_EnterStudyProgramModule() {
        studyProgramModule.enterStudyProgramModule();
    }

    @Test
    public void step4_goToSecondPage() {
        studyProgramModule.clickSecondPageButton();
    }

    @Test
    public void step5_goBackToFirstPage() {
        studyProgramModule.clickFirstPageButton();
    }
    @Test
    public void step6_gotoNextPage() {
        studyProgramModule.clickNextPageButton();
    }
        @Test
    public void step7_goToPreviousPage() {
        studyProgramModule.clickPreviousPageButton();
    }
}