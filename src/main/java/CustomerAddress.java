import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CustomerAddress {
    WebDriver driver;
    WebDriverWait wait;
    By emailInSelector = By.id("email");
    By passwordSelector = By.id("passwd");
    By signInButtonSelector = By.cssSelector("#SubmitLogin>span");
    By signInSectionSelector = By.cssSelector(".header_user_info>a");
    By myAccountManagerSelector = By.cssSelector(".row.addresses-lists ul >li");
    public  static List<WebElement> accountInfo;
    //public  static WebElement accountInfo;
    public  static WebElement oderHistoryAndDetails;
    public  static WebElement myCreditSlips;
    public  static WebElement myAddressesDetails;
    public  static WebElement myPersonalInformation;
    public  static WebElement  MyWishlists;

    public CustomerAddress(WebDriver driver) {
        this.driver = driver;
    }


    public CustomerAddress signIn(String email, String password) {
        wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(signInSectionSelector));


        driver.findElement(signInSectionSelector).click();
        driver.findElement(emailInSelector).sendKeys(email);
        driver.findElement(passwordSelector).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(signInButtonSelector));
        driver.findElement(signInButtonSelector).click();
        System.out.println("You just sign in !!");
        return this;
    }
/*
        public CustomerAddress accountDetails(){
        List<WebElement> accountInfo= driver.findElements(myAccountManagerSelector);
        WebElement oderHistoryAndDetails= accountInfo.get(1);
        WebElement myCreditSlips = accountInfo.get(2);
        WebElement myAddressesDetails = accountInfo.get(3);
        WebElement myPersonalInformation =  accountInfo.get(4);
        WebElement MyWishlists = accountInfo.get(5);
        return this;
    }*/


    public WebElement myAddresses() {
      //  List<WebElement> accountInfo = driver.findElements(myAccountManagerSelector);

        WebElement myAddressesDetails = this.accountInfo.get(3);
        System.out.println("You just loaded the address webElement");
        return myAddressesDetails;
    }


}
