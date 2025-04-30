package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    private static final String DEFAULT_APPIUM_URL = "http://127.0.0.1:";

    public static AppiumDriver createDriver(String platformName, String deviceName,
                                            String udid, String port, String systemPort) {
        DesiredCapabilities caps = new DesiredCapabilities();

        // الأساسيات
        caps.setCapability("platformName", platformName);
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("udid", udid);

        // إعدادات خاصة بالأندرويد
        if (platformName.equalsIgnoreCase("android")) {
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.coloros.calculator");
            caps.setCapability("appActivity", "com.android.calculator2.Calculator");
            caps.setCapability("systemPort", systemPort);

            // إعدادات إضافية لتحسين الموثوقية
//            caps.setCapability("ignoreHiddenApiPolicyError", true);
//            caps.setCapability("autoGrantPermissions", true);
//            caps.setCapability("noReset", false);
        }
        // إعدادات خاصة بـ iOS
        else if (platformName.equalsIgnoreCase("ios")) {
            caps.setCapability("automationName", "XCUITest");
            // أضف إعدادات iOS هنا
        }

        try {
            URL appiumServerUrl = new URL(DEFAULT_APPIUM_URL + port + "/");

            AppiumDriver driver;
            if (platformName.equalsIgnoreCase("android")) {
                driver = new AndroidDriver(appiumServerUrl, caps);
            } else if (platformName.equalsIgnoreCase("ios")) {
                driver = new IOSDriver(appiumServerUrl, caps);
            } else {
                throw new IllegalArgumentException("Platform not supported: " + platformName);
            }

            // إعدادات زمنية للجلسة
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException("Appium server URL is invalid", e);
        }
    }
}