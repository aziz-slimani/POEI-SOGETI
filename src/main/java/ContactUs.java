import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs {
    WebDriver driver;
    WebDriverWait wait;

    public ContactUs(WebDriver driver){
        this.driver=driver;
    }
    By headerLogoSelector =By.cssSelector("#header_logo >a>img");

    public Homepage backToHomePageByLogo(){
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(headerLogoSelector));
        driver.findElement(headerLogoSelector).click();
        return new Homepage((driver));
    }


}
