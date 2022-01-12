package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage extends BasePage {

    public CheckoutTwoPage(WebDriver driver) {
        super(driver);
    }

    public static final By FINISH_BUTTON = By.id("finish");
    public static final String FINISH_H2 = "//h2[@class='complete-header']";
    @Step("Check there is final phrase")
    public String setFinishH2() {
        return driver.findElement(By.xpath(FINISH_H2)).getText();
    }
    @Step("Click finish button")
    public void buttonFinishClick() {
        driver.findElement(FINISH_BUTTON).click();
    }
    @Step("check that there is a  button Finish")
    public boolean checkoutTwoButtonFinish() {
        return driver.findElement(FINISH_BUTTON).isDisplayed();
    }

}
