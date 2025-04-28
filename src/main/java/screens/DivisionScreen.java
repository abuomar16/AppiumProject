package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class DivisionScreen {

    private AppiumDriver driver;

    // Locators for buttons
    private By button6 = By.id("com.coloros.calculator:id/digit_6");
    private By button2 = By.id("com.coloros.calculator:id/digit_2");
    private By buttonDivide = By.id("com.coloros.calculator:id/op_div");
    private By buttonEquals = By.id("com.coloros.calculator:id/eq");
    private By resultText = By.id("com.coloros.calculator:id/result");

    // Constructor
    public DivisionScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickButton6() {
        driver.findElement(button6).click();
    }

    public void clickButton2() {
        driver.findElement(button2).click();
    }

    public void clickDivide() {
        driver.findElement(buttonDivide).click();
    }

    public void clickEquals() {
        driver.findElement(buttonEquals).click();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
