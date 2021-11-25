import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest {

    @Test
    public void locator() {
//          id
        WebElement continueButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

//        xpath
        WebElement linkShoppingCard = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));

//        xpath
//        Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        WebElement filterPointFour = driver.findElement(By.xpath("//option[@value='hilo']"));

//        Поиск по тексту, например By.xpath("//tag[text()='text']");
        WebElement filterPointTwo = driver.findElement(By.xpath("//option[text()='Name (Z to A)']"));

//        Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        WebElement filterPointOne = driver.findElement(By.xpath("//option[contains(@value, 'az')]"));

//        Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");
        WebElement filterPointTree = driver.findElement(By.xpath("//option[contains(text(), '(low to high)')]"));

//        ancestor, например //*[text()='Enterprise Testing']//ancestor::div
        WebElement addToCardButton = driver.findElement(By.xpath("//div[@class = 'pricebar']//ancestor::button"));

//        descendant
        WebElement photoOfFirstBlock = driver.findElement(By.xpath("//div[@class = 'inventory_item']//descendant::img"));

//        following
        WebElement productSortList = driver.findElement(By.xpath("//div[@class = 'right_component']//following::select"));

//        parent
        WebElement titleHeader = driver.findElement(By.xpath("//span[text() = 'Products']//parent::div"));

//        preceding
        WebElement menu = driver.findElement(By.xpath("//nav[@class = 'bm-item-list']//preceding::div/div"));

//        *поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']
        // тут я вообще не разобраласт как делать

//
//        css
//        .class
        WebElement menuIcon = driver.findElement(By.cssSelector(".bm-icon"));

//        .class1.class2
        WebElement menuListAllItems = driver.findElement(By.cssSelector(".bm-item.menu-item"));

//         .class1 .class2
        WebElement titleProducts = driver.findElement(By.cssSelector(".header_secondary_container .title"));

//          #id
        WebElement shoppingCartBlock = driver.findElement(By.cssSelector("#shopping_cart_container"));

//          tagname
        WebElement navigation = driver.findElement(By.cssSelector("nav"));

//          tagname.class
        WebElement price = driver.findElement(By.cssSelector("div.inventory_item_price"));

//          [attribute=value]
        WebElement blockFirstCard = driver.findElement(By.cssSelector("[class = inventory_item]"));

//          [attribute~=value]
        WebElement mainTitle = driver.findElement(By.cssSelector("[class ~= title]"));

//          [attribute|=value]
        WebElement imgFirstBlock = driver.findElement(By.cssSelector("[class |= inventory_item_img]"));

//          [attribute^=value]
        WebElement links = driver.findElement(By.cssSelector("a[href^ = https]"));

//          [attribute$=value]
        WebElement AboutListLinks = driver.findElement(By.cssSelector("a[href $= .com]"));

//          [attribute*=value]
        WebElement linksWithLattice = driver.findElement(By.cssSelector("a[href *= #]"));
    }
}
