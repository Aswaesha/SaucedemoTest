import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCardTest extends BaseTest {

    String userNameInputByIdLocator = "user-name";
    String passwordInputByIdLocator = "password";
    String loginButtonByXpathLocator = "//input[@value='Login']";
    String shoppingCardByXpathLocator = "//a[@class='shopping_cart_link']";
    String addToCardButtonByIdLocator = "add-to-cart-test.allthethings()-t-shirt-(red)";
    String nameOfProductByXpathLocator = "//div[text()='Test.allTheThings() T-Shirt (Red)']";
    String costOfProductByXpathLocator = "//div[text()='Test.allTheThings() T-Shirt (Red)']//following::div/div";

    @Test
    public void addToCard() {
        driver.get("https://www.saucedemo.com/");

        WebElement userNameInput = driver.findElement(By.id(userNameInputByIdLocator));
        userNameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.id(passwordInputByIdLocator));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath(loginButtonByXpathLocator));
        loginButton.click();

        WebElement nameOfProduct = driver.findElement(By.xpath(nameOfProductByXpathLocator));
        String textByNameOfProduct = nameOfProduct.getText();
        WebElement costOfProduct = driver.findElement(By.xpath(costOfProductByXpathLocator));
        String textByCostOfProduct = costOfProduct.getText();

        WebElement addToCardButton = driver.findElement(By.id(addToCardButtonByIdLocator));
        addToCardButton.click();

        WebElement shoppingCard = driver.findElement(By.xpath(shoppingCardByXpathLocator));
        shoppingCard.click();

        WebElement nameOfProductAtCard = driver.findElement(By.xpath(nameOfProductByXpathLocator));
        String textByNameOfProductAtCard = nameOfProductAtCard.getText();
        WebElement costOfProductAtCard = driver.findElement(By.xpath(costOfProductByXpathLocator));
        String textByCostOfProductAtCard = costOfProductAtCard.getText();

        Assert.assertEquals(textByNameOfProduct, textByNameOfProductAtCard, "Product name doesn't match");
        Assert.assertEquals(textByCostOfProduct, textByCostOfProductAtCard, "Product cost doesn't match");

    }
}