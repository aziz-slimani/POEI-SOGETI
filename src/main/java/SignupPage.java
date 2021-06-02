import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    WebDriver driver ;
    By genderMale = By.cssSelector("#id_gender1") ;
    By genderFemale = By.cssSelector("#id_gender2") ;

    By customerFirstname = By.cssSelector("#customer_firstname") ;
    By customerLastname= By.cssSelector("#customer_lastname") ;
    By passwd= By.cssSelector("#passwd");
    By address1= By.cssSelector("#address1") ;
    By city= By.cssSelector("#city") ;
    By drpState = By.cssSelector("#id_state") ;
    By postcode = By.cssSelector("#postcode") ;
    By phoneMobile = By.cssSelector("#phone_mobile") ;
    By alias = By.cssSelector("#alias") ;
    By submitAccount =By.cssSelector("#submitAccount") ;

    public SignupPage(WebDriver driver) {

        this.driver = driver;
    }
    public void fillForm(String customerFirstname, String customerLastname, String passwd  ) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.customerFirstname));
        driver.findElement(genderMale).click();
        driver.findElement(this.customerFirstname).sendKeys(customerFirstname);
        driver.findElement(this.customerLastname).sendKeys(customerLastname);
        driver.findElement(this.passwd).sendKeys("000000");
        driver.findElement(address1).sendKeys("3 rue de vendome");
        driver.findElement(city).sendKeys("orleans");
        driver.findElement(postcode).sendKeys("45100");
        driver.findElement(phoneMobile).sendKeys("0762630751");
        driver.findElement(alias).sendKeys("main residence");
        Select drpCountry = new Select(driver.findElement(drpState));
        drpCountry.selectByVisibleText("California");
        driver.findElement(submitAccount).click();

    }

}
