import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;



public class AuthentificationPage {
    WebDriver driver;

    By emailInput = By.cssSelector("#email") ;
    By passwordSelector = By.cssSelector("#passwd") ;
    By emailCreate= By.cssSelector("#email_create") ;
    By SubmitCreate= By.cssSelector("#SubmitCreate");
    By SubmitLogin= By.cssSelector("#SubmitLogin") ;


    public AuthentificationPage(WebDriver driver) {

        this.driver = driver;
    }
    public void login(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordSelector).sendKeys(password);
        driver.findElement(SubmitLogin).click();

    }
    public SignupPage NewAccount(String newAccountMail){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailCreate));
        driver.findElement(emailCreate).sendKeys(newAccountMail);
        driver.findElement(SubmitCreate).click();

        return new SignupPage(driver);

    }



}



