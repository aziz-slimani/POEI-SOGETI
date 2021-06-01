import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage {

    WebDriver driver;

    public AddAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    By InputAddress1 = By.id("address1");
    By InputAddress2 = By.id("address2");
    By InputCity = By.id("city");
    By InputState = By.id("id_state");
    By InputPostcode = By.id("postcode");
    By InputPhone = By.id("phone");
    By InputAlias = By.id("alias");
    By btnSave = By.id("submitAddress");





    public void fillAddress1(String address) {
        driver.findElement(InputAddress1).sendKeys(address);
    }

    public void fillAddress2(String address2) {
        driver.findElement(InputAddress2).sendKeys(address2);
    }

    public void fillCity(String city) {
        driver.findElement(InputCity).sendKeys(city);
    }

    public void chooseState(String state){
        new Select( driver.findElement(InputState)).selectByVisibleText(state);
    }

    public void fillPostcode(String postCode) {
        driver.findElement(InputPostcode).sendKeys(postCode);
    }

    public void fillPhone(String phone) {
        driver.findElement(InputPhone).sendKeys(phone);
    }

    public void fillReference(String reference) {
        driver.findElement(InputAlias).clear();
        driver.findElement(InputAlias).sendKeys(reference);
    }

    public void clickOnSave(){
        driver.findElement(btnSave).click();

    }

}
