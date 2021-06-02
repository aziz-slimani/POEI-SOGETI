import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class creditSlipsPage {

    WebDriver driver;

    public creditSlipsPage(WebDriver driver) {
        this.driver = driver;
    }

    By logo = By.id("header_logo");


    public void backToHomePageByLogo() {
        driver.findElement(logo).click();
    }

    public MyAccountPage backToMyAccount() {
        List<WebElement> listArticles = driver.findElements(By.cssSelector(".icon-chevron-left"));
        listArticles.get(1).click();
        return new MyAccountPage(driver);

    }

}
