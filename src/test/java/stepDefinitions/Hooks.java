package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
   public static WebDriver driver;
   public static ExtentReports extent;
   public static ExtentTest test;

    @BeforeAll
    public static void setupDriver() {
        extent = ExtentReportManager.getInstance();
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }

    @AfterAll
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }
}
