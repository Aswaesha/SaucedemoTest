package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage extends BasePage {


    public static final By ADD_PRODUCT_BUTTON = By.xpath("//div[div[div[a[div[@class=\"inventory_item_name\"][text()=\"%s\"]]]]]//button");
    public static final By SHOPPING_CART = By.cssSelector(".shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    public void addToCart() {
        driver.findElement(ADD_PRODUCT_BUTTON).click();
    }
    @Step("Click at Shopping cart")
    public void cartClick() {
        driver.findElement(SHOPPING_CART).click();

    }

}




