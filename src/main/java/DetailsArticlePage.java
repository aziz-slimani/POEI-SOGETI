import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsArticlePage {


    WebDriver driver;

    public DetailsArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    By InputPostcode = By.id("add_to_cart");

    public void AddToCart() {
        driver.findElement(InputPostcode);
        GeneralFunction.log("article is successfully added to cart");
    }
}
