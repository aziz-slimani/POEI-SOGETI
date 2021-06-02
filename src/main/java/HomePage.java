import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public static By searchQuerySelector= By.id("search_query_top");

    public SearchProduct searchArea(String searchedArticle){
        wait =new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchQuerySelector));
        driver.findElement(searchQuerySelector).sendKeys(searchedArticle + Keys.ENTER);
        return new SearchProduct(driver);

    }
}
