package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    TitlePage titlePage;
    CheckoutPage checkoutPage;
    CartPage cartPage;
    CheckoutTwoPage checkoutTwoPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        loginPage= new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        titlePage = new TitlePage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutTwoPage = new CheckoutTwoPage(driver);

    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        driver.quit();
//    }

}
