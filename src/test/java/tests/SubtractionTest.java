package tests;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SubtractionScreen;

public class SubtractionTest extends BaseTest {

    @Epic("Subtraction Test  Module")
    @Feature("sub  2 number ")
    @Story(" number 1 is 5  , number 2 is 3 ")
    @Test
    public void testSubtraction() {
        SubtractionScreen subtractionPage = new SubtractionScreen(driver);

        // Performing actions for subtraction
        subtractionPage.clickButton5();
        subtractionPage.clickMinus();
        subtractionPage.clickButton3();
        subtractionPage.clickEquals();

        // Verifying result for subtraction
        String result = subtractionPage.getResult();
        Assert.assertEquals(result, "2", "The subtraction result is incorrect!");
    }
}
