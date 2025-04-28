package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SubtractionScreen {

    private AppiumDriver driver;

    // Locators for buttons
    private By button5 = By.id("com.coloros.calculator:id/digit_5");
    private By button3 = By.id("com.coloros.calculator:id/digit_3");
    private By buttonMinus = By.id("com.coloros.calculator:id/op_sub");
    private By buttonEquals = By.id("com.coloros.calculator:id/eq");
    private By resultText = By.id("com.coloros.calculator:id/result");

    // Constructor
    public SubtractionScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickButton5() {
        driver.findElement(button5).click();
    }

    public void clickButton3() {
        driver.findElement(button3).click();
    }

    public void clickMinus() {
        driver.findElement(buttonMinus).click();
    }

    public void clickEquals() {
        driver.findElement(buttonEquals).click();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
