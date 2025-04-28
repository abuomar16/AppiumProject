package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SubtractionScreen;

public class SubtractionTest extends BaseTest {

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
