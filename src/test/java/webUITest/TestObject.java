package webUITest;
import driverHelper.NonXmlRun;
import driverHelper.ParallelExc;
import listeners.AllureTestListener;
import listeners.CustomSuiteListener;
import listeners.CustomTestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;
import webUI.BaseObject;
import webUI.pageObject.*;

import static hibernate.HibernateMain.printCreatedProject;
import static hibernate.HibernateMain.printProblemTable;


@Listeners({
        CustomTestListener.class,
        CustomSuiteListener.class,
        AllureTestListener.class
})
public class TestObject extends ParallelExc {



    @Test
    public void  CreateProjectRoute() throws InterruptedException {
        WebDriver driver = get();
        BaseObject baseObject = new BaseObject(driver);
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        ProjectPage projectPage = new ProjectPage(driver);
        ManagePage managePage = new ManagePage(driver);
        baseObject.open("http://localhost/my_view_page.php");
        logInPage
                .writeUserName("administrator")
                .writeUserPassword("root");
        homePage
                .goToManagePage();
        managePage
                .goToProjectPage();
        projectPage
                .createProject()
                .writeData()
                .create();
        Assert.assertTrue(projectPage.checkCreation());
    }

    @Test
    public void  CreateProblemRoute() throws InterruptedException {
        WebDriver driver = get();
        BaseObject baseObject = new BaseObject(driver);
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        ProblemPage problemPage = new ProblemPage(driver);
        ProblemsBrowserPage problemsBrowserPage = new ProblemsBrowserPage(driver);
        CreateProblemPage createProblemPage = new CreateProblemPage(driver);
        baseObject.open("http://localhost/my_view_page.php");
        logInPage
                .writeUserName("administrator")
                .writeUserPassword("root");

    }

    @Test
    public void  InviteUserAndUpdateRoute() throws InterruptedException {
        WebDriver driver = get();
        BaseObject baseObject = new BaseObject(driver);
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        InviteUserPage inviteUserPage = new InviteUserPage(driver);
        UpdateUserPage updateUserPage = new UpdateUserPage(driver);
        baseObject.open("http://localhost/my_view_page.php");
        logInPage
                .writeUserName("administrator")
                .writeUserPassword("root");
        homePage
                .goInviteUserPage();
        inviteUserPage
                .writeDataInfo()
                .selectOption()
                .inviteNewUser();
        updateUserPage
                .updateDataInfo()
                .updateSelectOption()
                .updateUser();
    }

}
