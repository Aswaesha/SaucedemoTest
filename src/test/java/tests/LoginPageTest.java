package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginPageTest extends BaseTest {

    @Test()
    public void addToCard() {
        driver.get("https://www.saucedemo.com/");
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");

    }

    @Test
    public void userPasswordShouldBeRequired () {
        loginPage.open();
        loginPage.login("standard_user","");
        Assert.assertEquals(loginPage.getErrorMassage(),"Epic sadface: Password is required","Сообщение об ошибке не верно");

    }
    @Test
    public void userNameShouldBeRequired () {
        loginPage.open();
        loginPage.login("","secret_sauce");
        Assert.assertEquals(loginPage.getErrorMassage(),"Epic sadface: Username is required","Сообщение об ошибке не верно");

    }

}