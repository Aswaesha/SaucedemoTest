package tests;

//import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import tests.base.BaseTest;
//import tests.base.Retry;

public class LoginPageTest extends BaseTest {

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