import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
    public MyAccountPage login(String email, String password){
        GeneralFunction.waitUntilVisible(emailInput,driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordSelector).sendKeys(password);
        driver.findElement(SubmitLogin).click();
        return new MyAccountPage(driver);
    }
    public SignupPage NewAccount(String newAccountMail){
       commun.GeneralFunction.waitUntilVisible(emailInput,driver);
        driver.findElement(emailCreate).sendKeys(newAccountMail);
        driver.findElement(SubmitCreate).click();

        return new SignupPage(driver);

    }



}



