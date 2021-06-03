import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAddressPage {

    WebDriver driver;

    public UpdateAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    By InputReference = By.id("alias");
    By btnSave = By.id("submitAddress");

    By InputAddress = By.id("address");
    By InputCity = By.id("city");
    By InputPostcode = By.id("postcode");



    public void updateAddress1(String address) {
        driver.findElement(InputAddress).sendKeys(address);
    }

    public void updateReference(String reference) {
        driver.findElement(InputReference).sendKeys(reference);
    }

    public void updateCity(String city) {
        driver.findElement(InputCity).sendKeys(city);
    }

    public void updatePostCode(String postCode) {
        driver.findElement(InputPostcode).sendKeys(postCode);
    }


    public void save(){
        driver.findElement(btnSave).click();

    }
}
