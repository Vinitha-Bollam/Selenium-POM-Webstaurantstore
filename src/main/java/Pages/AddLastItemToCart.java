package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AddLastItemToCart {

    private WebDriver driver;
    By LastItem = By.cssSelector("#product_listing>div:last-of-type>div:last-of-type");
    By LastItemDesc = By.cssSelector("#product_listing>div:last-of-type>div#details>a:last-of-type");
    By ViewCartNotification = By.cssSelector("a[href*='viewcart']");
   // By ViewCartNotification = By.cssSelector(".notification__action>a:first-of-type");
    By Cart = By.cssSelector("a[href*='cart']>span:first-of-type");
  //  By Cart = By.cssSelector("#react_0HMNF3C0IMFOU>div>div>div:last-of-type>a:last-of-type>span:first-of-type");

    public AddLastItemToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        //Add last of found item to the cart
        driver.findElement(LastItem).click();
        System.out.println("Last of found Item added to cart --> " + driver.findElement(LastItemDesc).getText());

        List<WebElement> list = driver.findElements(ViewCartNotification);
        if(list.size() > 0) {
            driver.findElement(ViewCartNotification).click();
        }
        else {
            driver.findElement(Cart).click();
        }

   //     try {
    //        driver.findElement(ViewCartNotification).click();
    //    } catch (Exception e) {
   //         driver.findElement(Cart).click();
        }
    }

