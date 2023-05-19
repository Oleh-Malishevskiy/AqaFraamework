package webUITest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import webUI.BaseObject;
import webUI.pageObject.HomePage;
import webUI.pageObject.LogInPage;
import webUI.pageObject.ManagePage;
import webUI.pageObject.ProjectPage;

import static driverHelper.ParallelExc.getDriver;

public class TestEdge {

    @Test
    public void  CreateProjectRoute2() throws InterruptedException {
        WebDriver driver = getDriver();
        BaseObject baseObject = new BaseObject(driver);
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        ProjectPage projectPage = new ProjectPage(driver);
        ManagePage managePage = new ManagePage(driver);
        baseObject.open("http://localhost/my_view_page.php");
        logInPage
                .writeUserName()
                .writeUserPassword();
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
}
