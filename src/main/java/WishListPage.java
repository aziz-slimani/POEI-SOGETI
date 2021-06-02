import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {

    WebDriver driver;
    By backButtonSelector = By.cssSelector("#block_top_menu > ul >li:nth-of-type(1)");
    public void backToAccount (String email) {
        driver.findElement(backButtonSelector).click();

    }
}
