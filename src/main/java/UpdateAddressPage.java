import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAddressPage {

    WebDriver driver;

    public UpdateAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    By InputReference = By.id("alias");
    By btnSave = By.id("submitAddress");




    public void updateReference(String motCle) {
        driver.findElement(InputReference).sendKeys(motCle);
        driver.findElement(btnSave).click();
    }
}
