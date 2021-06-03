import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAddresses {
    WebDriver driver;
    public static By addAddress = By.cssSelector("#center_column .clearfix>a>span");
    public static By deleteUpdateSelector = By.cssSelector(".first_item .address_update>a>span");
    public static By backToAccount = By.cssSelector(".icon-chevron-left");


    public MyAddresses(WebDriver driver) {

        this.driver = driver;

    }

    public AddAddressPage addAddress() {
        driver.findElement(addAddress).click();
        System.out.println("You just added an address");
        return new AddAddressPage(driver);
    }

    public UpdateAddressPage updateAddress() {
        List<WebElement> deleteUpdateList = driver.findElements(deleteUpdateSelector);
        deleteUpdateList.get(1).click();
        System.out.println("Your address have been updated");
        return new UpdateAddressPage(driver);
    }

    public MyAddresses deleteAddress() {
        List<WebElement> deleteUpdateList = driver.findElements(deleteUpdateSelector);
        deleteUpdateList.get(2).click();
        System.out.println("You just deleted an address");
        return this;
    }

    public MyAccountPage backToMyAccount() {
        List<WebElement> listArticles = driver.findElements(backToAccount);
        listArticles.get(1).click();
        System.out.println("Back to home page");
        return new MyAccountPage(driver);

    }


}
