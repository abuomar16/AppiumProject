package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AdditionScreen;

public class AdditionTest extends BaseTest {

    @Test
    public void testAddition() {
        AdditionScreen calculatorPage = new AdditionScreen(driver);

        // Performing actions
        calculatorPage.clickButton5();
        calculatorPage.clickPlus();
        calculatorPage.clickButton3();
        calculatorPage.clickEquals();

        // Verifying result
        String result = calculatorPage.getResult();
        Assert.assertEquals(result, "8", "The addition result is incorrect!");
    }
}
