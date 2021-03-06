import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class WishListPage {

    WebDriver driver;
    By backButtonSelector = By.cssSelector("#block_top_menu > ul >li:nth-of-type(1)");
    public static By backToAccount = By.cssSelector(".icon-chevron-left");
    By Logo = By.cssSelector("#header_logo") ;

    public WishListPage(WebDriver driver){
        this.driver = driver ;

    }
    public MyAccountPage backToAccount () {
        driver.findElement(backButtonSelector).click();
        GeneralFunction.log("Account page is opened successfully");
        return new MyAccountPage(driver);

    }

    public MyAccountPage backToMyAccount2() {
        List<WebElement> listArticles = driver.findElements(backToAccount);
        listArticles.get(1).click();
        System.out.println("Back to my account page");
        return new MyAccountPage(driver);

    }

    public boolean logoVerification () {
        return driver.findElement(Logo).isDisplayed();
    }




}
