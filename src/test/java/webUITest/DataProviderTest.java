package webUITest;

import driverHelper.NonXmlRun;
import driverHelper.ParallelExc;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import webUI.BaseObject;
import webUI.pageObject.*;

public class DataProviderTest extends ParallelExc {
    @DataProvider
    private Object[][] LogInProvider(){
        int n=2; //number of test data sets
        int m=3; //argument number (int a, int b, int expected)

        Object[][] res= new Object[n][m];
        res[0]= new Object[]{"0c21d740-5","Qqwe12345678"};
        res[1]= new Object[]{"0c21d740-5","Qqwe12345678"};
        return res;
    }
        @Test(dataProvider = "LogInProvider")
    public void  CreateProblemRoute(String name, String password) throws InterruptedException {

//        DriverPool driverPool = new DriverPool();
        WebDriver driver = get();
        BaseObject baseObject = new BaseObject(driver);
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        ProblemPage problemPage = new ProblemPage(driver);
        ProblemsBrowserPage problemsBrowserPage = new ProblemsBrowserPage(driver);
        CreateProblemPage createProblemPage = new CreateProblemPage(driver);
        baseObject.open("http://localhost/my_view_page.php");
        logInPage
                .writeUserName(name)
                .writeUserPassword(password);
        homePage
                .goToProblemPage();
//        problemPage
//                .openSelect()
//                .chooseOption();
        createProblemPage
//                .selectUser()
                .writeInfo()
                .createProblem();
        Assert.assertTrue(problemsBrowserPage.getProblemName());
    }
}
