package tests;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AdditionScreen;

public class AddationTest extends BaseTest {



    @Epic("Additions Test  Module")
    @Feature("sum 2 number ")
    @Story(" number 1 is 5  , number 2 is ")
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
