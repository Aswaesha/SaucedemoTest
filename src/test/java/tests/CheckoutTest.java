package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckoutTest extends BaseTest {
    @Test(description = "Checkout page is display ")
    public void checkoutIsDisplay() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("Alex", "Petrov", "246056");
        Assert.assertEquals(checkoutTwoPage.checkoutTwoButtonFinish(), true, "Вы не вошли на страницу");

    }

    @Test(description = "Check error massage without first name")
    public void checkoutNotDisplayWithoutFirstName() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("", "Petrov", "246056");
        checkoutPage.checkoutContinueButtonClick();
        Assert.assertEquals(checkoutPage.getErrorMassageCheckout(), "Error: First Name is required", "Сообщение об ощибке неверно");

    }

    @Test(description = "Check error massage without postal code")
    public void checkoutNotDisplayWithoutCode() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("Alex", "Petrov", "");
        checkoutPage.checkoutContinueButtonClick();
        Assert.assertEquals(checkoutPage.getErrorMassageCheckout(), "Error: Postal Code is required", "Сообщение об ощибке неверно");

    }

    @Test(description = "Check there is final page")
    public void checkoutNotDisplayFinlaPage() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("Alex", "Petrov", "123456");

        checkoutTwoPage.buttonFinishClick();
        Assert.assertEquals(checkoutTwoPage.setFinishH2(), "THANK YOU FOR YOUR ORDER", "Вы не на финальной странице");
    }
}
