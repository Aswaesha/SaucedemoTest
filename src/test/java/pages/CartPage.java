package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    WebDriver driver;



    public static final By CONTINUE_SHOPPING_BUTTON = By.id("continue-shopping");
    public static final By CHEACKOUT_BUTTON = By.id("checkout");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void checkoutButtonClick(){
        driver.findElement(CHEACKOUT_BUTTON).click();
    }
}
