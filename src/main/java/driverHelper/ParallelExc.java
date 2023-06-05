package driverHelper;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class ParallelExc {
    protected static ThreadLocal<WebDriver> threadLocalDriver =  new ThreadLocal<WebDriver>();


    @BeforeMethod
    public void set() {
        WebDriver driver = DriverPool.createDriverInstance("chrome");
        threadLocalDriver.set(driver);
    }

    public static WebDriver get() {
        return threadLocalDriver.get();
    }

//    @AfterMethod
//    public void removeDriver() {
//        get().close();
//        get().quit();
//        threadLocalDriver.remove();
//    }
}
