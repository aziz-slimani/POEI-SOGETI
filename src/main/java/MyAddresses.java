import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAddresses {
    WebDriver driver;
    public static By addAddress = By.cssSelector("#center_column .clearfix>a>span");
    public static By updateSelector = By.cssSelector(".last_item.item.box .icon-chevron-right.right");
    public static By deleteSelector = By.cssSelector(".icon-remove.right");
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
        driver.findElement(updateSelector).click();
        System.out.println("Your address have been updated");
        return new UpdateAddressPage(driver);
    }

    public MyAddresses deleteAddress() {
        driver.findElement(deleteSelector).click();
        driver.switchTo().alert().accept();
        System.out.println("You just deleted an address");
        return this;
    }

    public MyAccountPage backToMyAccount() {
        List<WebElement> listArticles = driver.findElements(backToAccount);
        listArticles.get(1).click();
        System.out.println("Back to my account page");
        return new MyAccountPage(driver);

    }


}
