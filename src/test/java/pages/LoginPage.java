package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public static final By USERNAME_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//input[@value='Login']");
    public static final String ERROR_MASSAGE = "//h3[@data-test='error']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Step("Open website")
    public void open() {

        driver.get("https://www.saucedemo.com/");
    }
    @Step("Login as user name {******} use password {*******}")
    public void login(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
    @Step("Get error massage")
    public String getErrorMassage() {

        return driver.findElement(By.xpath(ERROR_MASSAGE)).getText();
    }


}
