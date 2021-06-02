import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestAutomationPractice {
    public static String email= "kakmenikeou@gmail.com";
    public static String password="12345";
    public static String searchedArticles= "dress";
    WebDriver driver;

    @BeforeMethod
    public void lunchChrome(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();



    }


    @Test
    public void addToCart(){
        //HomePage homePage = new HomePage(driver);
       // homePage.searchArea(searchedArticles).openFloatingMenu();
       //System.out.println( homePage.searchArea(searchedArticles).openFloatingMenu().isAddToCartDisplayed() + "kak");
       //homePage.searchArea(searchedArticles).backToHomePageByLogo();

        Women women= new Women(driver);
        women.backToHomePageByLogo().openCart();




    }
}
