import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

    WebDriver driver;
    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    By ContactUs = By.id("contact-link");
    By logo = By.id("header_logo");

    public void openContactUsPage() {

        driver.findElement(ContactUs).click();
    }

    public void backToHomePageByLogo() {
        driver.findElement(logo).click();
    }


}
