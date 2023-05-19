package driverHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.concurrent.TimeUnit;

public class DriverPool {
    public static WebDriver createDriverInstance(String browserType) {

        WebDriver driver = null;

        if(browserType.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        }else if(browserType.equals("firefox")) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            FirefoxOptions options = new FirefoxOptions();

            driver = new FirefoxDriver(options);

        }else if(browserType.equals("ie")) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            InternetExplorerOptions options = new InternetExplorerOptions();

            options.introduceFlakinessByIgnoringSecurityDomains();

            options.ignoreZoomSettings();

            driver = new InternetExplorerDriver(options);

        }else if(browserType.equals("edge")) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            driver = new EdgeDriver();

        }
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;

    }
}
