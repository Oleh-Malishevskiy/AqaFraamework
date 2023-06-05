package driverHelper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class NonXmlRun {
    protected static ThreadLocal<WebDriver> threadLocalDriverNonXml =  new ThreadLocal<WebDriver>();


    @Parameters({"browser"})
    @BeforeMethod
    public void setDriver(String type) {
        WebDriver driver = DriverPool.createDriverInstance(type);
        threadLocalDriverNonXml.set(driver);
    }

    public static WebDriver getDriver() {
        return threadLocalDriverNonXml.get();
    }

    @AfterMethod
    public void removeDriver() {
        getDriver().close();
        getDriver().quit();
        threadLocalDriverNonXml.remove();
    }
}
