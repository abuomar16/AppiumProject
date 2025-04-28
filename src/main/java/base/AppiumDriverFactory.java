package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverFactory {

    private static AppiumDriver driver;

    // Method to initialize the Appium Driver
    public static AppiumDriver getDriver() {
        if (driver == null) {
            try {

                // Set desired capabilities

                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformName", "Android");
                caps.setCapability("deviceName", "3842acc9");
                //caps.setCapability("deviceName", "emulator-5554");  // Device name or UDID of real device
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("noReset", true);
                caps.setCapability("appPackage", "com.coloros.calculator");  // App package name
                caps.setCapability("appActivity", "com.android.calculator2.Calculator");  // App activity name

                // Initialize AndroidDriver with the Appium server URL
                URL appiumServerUrl = new URL("http://127.0.0.1:4723/");
                driver = new AndroidDriver(appiumServerUrl, caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;

    }

    // Method to quit the driver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
