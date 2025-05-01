package tests;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DivisionScreen;

public class DivisionTest extends BaseTest {

    @Epic("Division Test  Module")
    @Feature("Divide 2 number ")
    @Story(" number 1 is 6  , number 2 is ")
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
