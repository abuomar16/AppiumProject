package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MultiplicationScreen {

    private AppiumDriver driver;

    // Locators for buttons
    private By button4 = By.id("com.coloros.calculator:id/digit_4");
    private By button3 = By.id("com.coloros.calculator:id/digit_3");
    private By buttonMultiply = By.id("com.coloros.calculator:id/op_mul");
    private By buttonEquals = By.id("com.coloros.calculator:id/eq");
    private By resultText = By.id("com.coloros.calculator:id/result");

    // Constructor
    public MultiplicationScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickButton4() {
        driver.findElement(button4).click();
    }

    public void clickButton3() {
        driver.findElement(button3).click();
    }

    public void clickMultiply() {
        driver.findElement(buttonMultiply).click();
    }

    public void clickEquals() {
        driver.findElement(buttonEquals).click();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
