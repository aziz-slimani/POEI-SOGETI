import commun.GeneralFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUS4 {


    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        GeneralFunction.ouvrirChrome();
        driver = GeneralFunction.getWebDriver();
    }

    // Arrange
    String userName = "nouha.bek985@gmail.com";
    String password = "Root@2021";

    @Test
    public void searchArticle() {

        Homepage homePage = new Homepage(driver);
        homePage.openSignInPage()
                .login(userName, password)
                .searchProducts("dress");
    }

    @Test
    public void searchArticleBySuggestion() {

        Homepage homePage = new Homepage(driver);
        homePage.openSignInPage()
                .login(userName, password)
                .searchProductsBySuggestion("dress");
    }


   @AfterMethod
    public void fermerChrome() {
        driver.quit();
    }

}
