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



    public AddAddressPage enterAddress1(String address) {
        driver.findElement(InputAddress1).sendKeys(address);
        return this;
    }

    public AddAddressPage enterAddress2(String address2) {
        driver.findElement(InputAddress2).sendKeys(address2);
        return this;
    }

    public AddAddressPage enterCity(String city) {
        driver.findElement(InputCity).sendKeys(city);
        return this;
    }

    public AddAddressPage selectState(String state){
        new Select( driver.findElement(InputState)).selectByVisibleText(state);
        return this;
    }

    public AddAddressPage enterPostcode(String postCode) {
        driver.findElement(InputPostcode).sendKeys(postCode);
        return this;
    }

    public AddAddressPage enterPhone(String phone) {
        driver.findElement(InputPhone).sendKeys(phone);
        return this;
    }

    public AddAddressPage enterReference(String reference) {
        driver.findElement(InputAlias).clear();
        driver.findElement(InputAlias).sendKeys(reference);
        return this;
    }

    public MyAddresses save(){
        driver.findElement(btnSave).click();
        return new MyAddresses(driver) ;

    }


}



