import commun.GeneralFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestUS3 {
    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        GeneralFunction.ouvrirChrome();
        driver = GeneralFunction.getWebDriver();
    }


    @AfterMethod
    public void fermerChrome() {
    driver.quit();
    }

    @Test
    public void accesToAllAccountElement() {
        //arrange
        String userName = "assoulaimani.abdelaziz@gmail.com" ;
        String password = "12345";
        String expectedTitle ="ORDER HISTORY" ;
        //act
    Homepage homepage = new Homepage(driver);
    OrderHistoryPage orderHistory= homepage.openSignInPage()
                                           .login(userName,password)
                                           .openOrderHistoryAndDetails();
    String result =orderHistory.getTitle();
    System.out.println(result);

       MyAccountPage myaccount= orderHistory.backToMyAccount()
                                 .openCreditSlip()
                                 .backToMyAccount()
                                 .openAddresses()
                                 .backToMyAccount()
                                 .openInformation()
                                 .backToAccount();

       WishListPage mywishlist= myaccount.openWishlists();
       CartPage mycart= mywishlist.backToAccount()
                                  .openShoppingCart();
        mycart.openContactUsPage()
              .backToHomePageByLogo();

       //Assert
        Assert.assertTrue(result.contains(expectedTitle));
        Assert.assertTrue(mywishlist.logoVerification());
        Assert.assertTrue(myaccount.logoVerification());
        Assert.assertTrue(mycart.logoVerification());
    }

}
