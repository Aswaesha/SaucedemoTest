package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class LoginPage extends BasePage {

    //WebDriver driver;

    public static final By USERNAME_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//input[@value='Login']");
    public static final By ERROR_MASSAGE = By.cssSelector(".error-massage-container");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void open(){

        driver.get("https://www.saucedemo.com/");
    }

    public void login(String userName , String password){
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMassage(){

        return driver.findElement(ERROR_MASSAGE).getText();
    }



}
