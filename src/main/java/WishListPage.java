import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage {

    WebDriver driver;
    By backButtonSelector = By.cssSelector("#block_top_menu > ul >li:nth-of-type(1)");
    By Logo = By.cssSelector("#header_logo") ;
    public WishListPage(WebDriver driver){
        this.driver = driver ;

    }
    public MyAccountPage backToAccount () {
        driver.findElement(backButtonSelector).click();
        GeneralFunction.log("Account page is opened successfully");
        return new MyAccountPage(driver);

    }
    public boolean logoVerification () {
        return driver.findElement(Logo).isDisplayed();
    }



}
