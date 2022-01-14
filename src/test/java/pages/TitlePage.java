package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TitlePage extends BasePage {


    public static final String TITLE_ON_MAIN_PAGE = "//span[@class='title']";

    public TitlePage(WebDriver driver) {

        super(driver);
    }

    public void open() {

        driver.get("https://www.saucedemo.com/inventory.html");
    }

    public String getTextTitle() {
        return driver.findElement(By.xpath(TITLE_ON_MAIN_PAGE)).getText();


    }

}
