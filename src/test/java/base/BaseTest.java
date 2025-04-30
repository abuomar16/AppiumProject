package base;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeTest
    @Parameters({"platformName", "deviceName", "udid", "port", "systemPort"})
    public void setUp(String platformName, String deviceName, String udid , String port, String systemPort) throws MalformedURLException {
        driver = DriverFactory.createDriver(platformName, deviceName, udid  , port, systemPort );
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}