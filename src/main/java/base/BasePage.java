package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class BasePage {

    AppiumDriver driver;
    WaitUtils waitUtils;

    // Constructor
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver); // عملنا الـ WaitUtils هنا عشان نستخدمه في كل الصفحات
    }

    // General method to find an element and wait until it's visible
    public WebElement findElement(By locator) {
        return waitUtils.waitForElementVisible(locator);
    }

    // General method to click on an element
    public void clickElement(By locator) {
        WebElement element = waitUtils.waitForElementClickable(locator);
        element.click();
    }

    public String getText(By locator) {
        WebElement element = waitUtils.waitForElementClickable(locator);
        return element.getText();
    }

    // General method to type into an input field
    public void typeText(By locator, String text) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        element.sendKeys(text);
    }

    // General method to check if element is displayed
    public boolean isElementDisplayed(By locator) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        return element.isDisplayed();
    }
}
