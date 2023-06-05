package listeners;

import driverHelper.DriverPool;
import driverHelper.ParallelExc;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureTestListener implements ITestListener {



    @Attachment(value="Page screen", type="image/png")
    public byte[] getScreenshot(){
        DriverPool driverPool = new DriverPool();
        WebDriver driver = driverPool.createDriverInstance("chrome");
        return ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value="{0}", type="text/plain")
    public String getDom(){
        DriverPool driverPool = new DriverPool();
        WebDriver driver = driverPool.createDriverInstance("chrome");
        return driver.getPageSource();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        getScreenshot();
        getDom();
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        getScreenshot();
        getDom();
        System.out.println(getDom());
    }
    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        getScreenshot();
        getDom();
    }
}
