package tests;

import org.testng.annotations.Test;

public class ProductCriticalPathTest extends BaseTest {
    @Test
    public void productShouldBeAddedIntoCard(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.addToCart();
       // inventoryPage.addToCart("Sauce Labs Onesie");
        //cardPage.open();
        //TODO validate name and price
    }
}
