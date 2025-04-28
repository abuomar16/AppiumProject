package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MultiplicationScreen;

public class MultiplicationTest extends BaseTest {

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
