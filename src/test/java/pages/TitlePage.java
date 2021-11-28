package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TitlePage extends BasePage{
    WebDriver driver;

    public static final String TITLE ="//span[@class='title']";

    public TitlePage(WebDriver driver) {

        super(driver);
    }
        public void open(){

        driver.get("https://www.saucedemo.com/inventory.html");
    }
    public String getTextTitle() {
        return driver.findElement(By.xpath(TITLE)).getText();

    }


}
