import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderHistoryPage {

    WebDriver driver;

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By logo = By.id("header_logo");
    By title =By.cssSelector("[id='center_column']>h1");

    public void backToHomePageByLogo() {
        driver.findElement(logo).click();
    }

    public MyAccountPage backToMyAccount() {
        List<WebElement> listArticles = driver.findElements(By.cssSelector(".icon-chevron-left"));
        commun.GeneralFunction.waitUntilVisible(logo,driver);
        listArticles.get(1).click();
        GeneralFunction.log("Account page is opened successfully");
        return new MyAccountPage(driver);

    }
public String getTitle() {
    GeneralFunction.waitUntilVisible(title,driver);
    return driver.findElement(title).getText();

}


}
