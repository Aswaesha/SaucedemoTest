package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    WebDriver driver;

    public static final By FIRSTNAME_INPUT = By.id("first-name");
    public static final By LASTNAME_INPUT = By.id("last-name");
    public static final By POSTAL_CODE_INPUT = By.id("postal-code");
    public static final By CONTINUE_BUTTON = By.id("continue");
    public static final By CANCEL_BUTTON = By.id("cancel");
    public static final By ERROR_MASSAGE = By.xpath("//h3[@data-test='error']");



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void checkOut(String firstName, String lastName, String postalCode) {
        driver.findElement(FIRSTNAME_INPUT).sendKeys(firstName);
        driver.findElement(LASTNAME_INPUT).sendKeys(lastName);
        driver.findElement(POSTAL_CODE_INPUT).sendKeys(postalCode);
        driver.findElement(CONTINUE_BUTTON).click();
        driver.findElement(CANCEL_BUTTON).click();
    }
    public void checkoutContinueButtonClick(){
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public String getErrorMassageCheckout(){

        return driver.findElement(ERROR_MASSAGE).getText();
    }
}
