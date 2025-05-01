package tests;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MultiplicationScreen;

public class MultiplicationTest extends BaseTest {


    @Epic("Multiplication Test  Module")
    @Feature("Multiply  2 number ")
    @Story(" number 1 is 3  , number 2 is 4 ")
    @Test
    public void testMultiplication() {
        MultiplicationScreen multiplicationPage = new MultiplicationScreen(driver);

        // Performing actions for multiplication
        multiplicationPage.clickButton4();
        multiplicationPage.clickMultiply();
        multiplicationPage.clickButton3();
        multiplicationPage.clickEquals();

        // Verifying result for multiplication
        String result = multiplicationPage.getResult();
        Assert.assertEquals(result, "12", "The multiplication result is incorrect!");
    }
}
