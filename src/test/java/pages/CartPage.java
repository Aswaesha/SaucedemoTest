package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {


    public static final By CONTINUE_SHOPPING_BUTTON = By.id("continue-shopping");
    public static final By CHEACKOUT_BUTTON = By.id("checkout");


    public CartPage(WebDriver driver) {
        super(driver);
    }
    @Step("Click check out button")
    public void checkoutButtonClick() {
        driver.findElement(CHEACKOUT_BUTTON).click();
    }
}
