package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
//import tests.base.BaseTest;


public class TitleDisplayTest extends BaseTest {
    @Test
    public void textTitleOnPage() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        Assert.assertEquals(titlePage.getTextTitle(), "PRODUCTS", "No title");

    }
}
