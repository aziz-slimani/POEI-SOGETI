import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPage {

    WebDriver driver;
    By backButtonSelector = By.cssSelector(".footer_links li:nth-of-type(1)");
    public PersonalInfoPage(WebDriver driver){
        this.driver = driver ;

    }
    public MyAccountPage backToAccount () {
        driver.findElement(backButtonSelector).click();
        System.out.println("Back to account page");
        return new MyAccountPage((driver));
    }
}
