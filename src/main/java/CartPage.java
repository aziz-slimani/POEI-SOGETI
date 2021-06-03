import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

    WebDriver driver;
    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    By ContactUs = By.id("contact-link");
    By logo = By.id("header_logo");

    public ContactUs openContactUsPage() {

        driver.findElement(ContactUs).click();
        GeneralFunction.log("contact us page is opened successfully");
        return new ContactUs((driver));
    }

    public Homepage backToHomePageByLogo() {
        driver.findElement(logo).click();
        GeneralFunction.log("Home page is opened successfully by clicking logo");
        return new Homepage(driver);
    }
    public boolean logoVerification () {
        return driver.findElement(logo).isDisplayed();
    }



}
