import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestUS3 {
    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void fermerChrome() {
        driver.quit();
    }

    @Test
    public void accesToAllAccountElement() {
        String userName = "kakmenikoeu@gmail.com" ;
        String password = "123456";
    Homepage homepage = new Homepage(driver);
    homepage.openSignInPage()
            .login(userName,password)
            .openOrderHistoryAndDetails()
            .backToMyAccount()
            .openCreditSlip()
            .backToMyAccount()
            .openWishlists() /*forgotten open myadress*/
            .backToAccount()
            .openShoppingCart() //women element in my account
            .openContactUsPage()
            .backToHomePageByLogo();
    }
    @Test
    public void incorrectLogin() {
        // Arrange
        String userName = "kakmenikoeu@gmail.com" ;
        String password = "123456";
        // Act
        Homepage homePage = new Homepage(driver);
        homePage.openSignInPage()
                .login("kakmenikoeu@gmail.com","12345");

        // Asserts
        //Assert.assertTrue(result.contains(Keyword));
        //System.out.print(result.contains(Keyword));
    }
}