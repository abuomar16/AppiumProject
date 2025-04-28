package screens;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AdditionScreen extends BasePage {

    private AppiumDriver driver;

    // Locators for buttons
    private By button5 = By.id("com.coloros.calculator:id/digit_5");
    private By button3 = By.id("com.coloros.calculator:id/digit_3");
    private By buttonPlus = By.id("com.coloros.calculator:id/op_add");
    private By buttonEquals = By.id("com.coloros.calculator:id/eq");
    private By resultText = By.id("com.coloros.calculator:id/result");

    // Constructor
    public AdditionScreen(AppiumDriver driver) {
        super(driver);
    }

    // Actions
    public void clickButton5() {
        clickElement(button5) ;

    }

    public void clickButton3() {

        clickElement(button3) ;

    }

    public void clickPlus() {

        clickElement(buttonPlus) ;

    }

    public void clickEquals() {

        clickElement(buttonEquals) ;

    }

    public String getResult() {
       return  getText(resultText) ;
    }
}
