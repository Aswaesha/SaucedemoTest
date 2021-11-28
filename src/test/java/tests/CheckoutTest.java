package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest  extends BaseTest{
    @Test
    public void checkoutIsDisplay(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("Alex","Petrov","246056");
        checkoutPage.checkoutContinueButtonClick();
        Assert.assertEquals(checkoutTwoPage.checkoutTwoButtonFinish(),"true","Вы не вошли на страницу");

}
    @Test
    public void checkoutNotDisplayWithoutFirstName(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.cartClick();
        cartPage.checkoutButtonClick();

        checkoutPage.checkOut("","Petrov","246056");
        checkoutPage.checkoutContinueButtonClick();
        Assert.assertEquals(checkoutPage.getErrorMassageCheckout(),"Error: First Name is required","Сообщение об ощибке неверно");

    }
}
