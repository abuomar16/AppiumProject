package base;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = AppiumDriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverFactory.quitDriver();
    }
}
