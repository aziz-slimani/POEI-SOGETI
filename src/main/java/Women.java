import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Women {
    WebDriver driver;
    WebDriverWait wait;

    public Women(WebDriver driver){
        this.driver=driver;
    }
    By womenButtonSelector = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    By headerLogoSelector =By.cssSelector("#header_logo >a>img");
    By shoppingCartSelector = By.cssSelector(".shopping_cart>a");

    public Women openWomenPage() {
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(womenButtonSelector));
        driver.findElement(womenButtonSelector).click();
        System.out.println("Your on the page 'women'!! ");
        return this;
    }
    public Women backToHomePageByLogo(){
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(headerLogoSelector));
        driver.findElement(headerLogoSelector).click();
        return this;
    }

    public Women openCart(){
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartSelector));
        driver.findElement(shoppingCartSelector).click();
        return this;

    }


}
