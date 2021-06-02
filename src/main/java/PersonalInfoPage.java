import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPage {

    WebDriver driver;
    By backButtonSelector = By.cssSelector(".footer_links li:nth-of-type(1)");
    public MyAccountPage backToAccount (String email) {
        driver.findElement(backButtonSelector).click();
        return new MyAccountPage((driver));
    }
}
