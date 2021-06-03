import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class SignInPage {

    WebDriver driver;
    By emailInput = By.id("email_create");
    By authentifiateButtom = By.id("SubmitCreate");
    public void enterEmail (String email) {

        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(authentifiateButtom).click();


    }
}
