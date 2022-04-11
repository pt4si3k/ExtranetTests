package tests.StudyProgramModule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.LoginPageStudent;
import pages.StudyModule;
import pages.StudyProgramModule;
import tests.LoginStudent.BaseTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CourseInformation_TS_PS_002 extends BaseTest {


    StudyModule studymodule = new StudyModule(BaseTest.driver);
    StudyProgramModule studyProgramModule = new StudyProgramModule(BaseTest.driver);
    LoginPageStudent loginPageStudent = new LoginPageStudent(BaseTest.driver);

    @Test
    public void step1_LoginAsStudent() {
        loginPageStudent.loginAsStudent("pzx95008@student.wsb.poznan.pl", "extranet30");
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
    public void step4_rollUpInformationCourse() {
        studyProgramModule.clickCourse();
        studyProgramModule.semesterInformation();
    }

    @Test
    public void step5_rollDownInformationCourse() {
        studyProgramModule.clickCourse();
        studyProgramModule.informationCourseRollDown();
    }

    @Test
    public void step6_rollUpInformationCourse() {
        studyProgramModule.clickCourse();
        studyProgramModule.semesterInformation();
    }

    @Test
    public void step7_rollUpInformationAnotherCourse() {
        studyProgramModule.anotherCourse();
    }
}