import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    WebDriver driver ;
    By genderMale = By.cssSelector("#id_gender1") ;
    By genderFemale = By.cssSelector("#id_gender2") ;
    By firstnameSelector = By.cssSelector("#customer_firstname") ;
    By lastnameSelector= By.cssSelector("#customer_lastname") ;
    By passwordSelector= By.cssSelector("#passwd");
    By addressSelector= By.cssSelector("#address1") ;
    By citySelector= By.cssSelector("#city") ;
    By drpState = By.cssSelector("#id_state") ;
    By postcode = By.cssSelector("#postcode") ;
    By phonenumberSelector = By.cssSelector("#phone_mobile") ;
    By aliasSelector = By.cssSelector("#alias") ;
    By submitAccount =By.cssSelector("#submitAccount") ;

    public SignupPage(WebDriver driver) {

        this.driver = driver;
    }

    public SignupPage enterFirstName (String firstName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameSelector));
        driver.findElement(firstnameSelector).sendKeys(firstName);
        return this ;
    }
    public SignupPage enterLastName (String lastName){
        driver.findElement(lastnameSelector).sendKeys(lastName);
        return this ;
    }
    public SignupPage enterPassword (String password){
        driver.findElement(passwordSelector).sendKeys(password);
        return this ;
    }
    public SignupPage enterAdress (String adress){
        driver.findElement(addressSelector).sendKeys(adress);
        return this ;
    }
    public SignupPage enterCity (String city){
        driver.findElement(citySelector).sendKeys(city);
        return this ;
    }
    public SignupPage enterPostCode (String postCode){
        driver.findElement(postcode).sendKeys(postCode);
        return this ;
    }
    public SignupPage enterphonenumber (String phoneNumber){
        driver.findElement(phonenumberSelector).sendKeys(phoneNumber);
        return this ;
    }
    public SignupPage enterAlias (String alias){
        driver.findElement(aliasSelector).sendKeys(alias);
        return this ;
    }

    public SignupPage selectState (String stateName) {
        Select drpCountry = new Select(driver.findElement(drpState));
        drpCountry.selectByVisibleText(stateName);
        return this;
    }
    public void validateAcountCreation(){
        driver.findElement(submitAccount).click();
    }


}
