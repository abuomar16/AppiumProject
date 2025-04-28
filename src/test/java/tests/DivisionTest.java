package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DivisionScreen;

public class DivisionTest extends BaseTest {

    @Test
    public void testDivision() {
        DivisionScreen divisionPage = new DivisionScreen(driver);

        // Performing actions for division
        divisionPage.clickButton6();
        divisionPage.clickDivide();
        divisionPage.clickButton2();
        divisionPage.clickEquals();

        // Verifying result for division
        String result = divisionPage.getResult();
        Assert.assertEquals(result, "3", "The division result is incorrect!");
    }
}
