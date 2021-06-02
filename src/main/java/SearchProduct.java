import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchProduct {
    WebDriver driver;
    WebDriverWait wait;
    public static String addToCart= "Add to cart";

    public SearchProduct(WebDriver driver) {

        this.driver = driver;
    }

    public  By elementLocatorSelector = By.cssSelector("#center_column > ul .ajax_block_product .product-container");
    public  By addToCartButtonSelector = By.cssSelector(".ajax_add_to_cart_button>span");
    public By headerLogoSelector =By.cssSelector("#header_logo >a>img");

    //#header_logo >a>img



    public SearchProduct openFloatingMenu() {
        List<WebElement> resultSearchArticleList = driver.findElements(elementLocatorSelector);
        Actions action = new Actions(driver);
        action.moveToElement(resultSearchArticleList.get(1)).build().perform();
        System.out.println("You just move your mouse on the article");
        return this;
    }

   public boolean isAddToCartDisplayed() {
       List<WebElement> getResultSearchAddToCartList = driver.findElements(addToCartButtonSelector);
        if (getResultSearchAddToCartList.get(1).getText().equalsIgnoreCase(addToCart) ) {
            System.out.println( addToCart+"is displayed");
            return true;

        } else {
            return false;
        }


    }

    public void backToHomePageByLogo(){
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(headerLogoSelector));
        driver.findElement(headerLogoSelector).click();

    }


}
