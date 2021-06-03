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
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }


    //@AfterMethod
    //public void fermerChrome() {
       // driver.quit();
    //}

    @Test
    public void accesToAllAccountElement() {
        //arrange
        String userName = "aob102@gmail.com" ;
        String password = "@ziZ1994";
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
                                 .openInformation()
                                 .backToAccount();
       WishListPage mywishlist= myaccount.openWishlists();
      CartPage mycart= mywishlist.backToAccount()
           .openShoppingCart();
               //women element in my account
        mycart.openContactUsPage()
              .backToHomePageByLogo();
       //Assert
        Assert.assertTrue(result.contains(expectedTitle));
        Assert.assertTrue(mywishlist.logoVerification());
        Assert.assertTrue(myaccount.logoVerification());
        Assert.assertTrue(mycart.logoVerification());
    }




        //System.out.print(result.contains(Keyword));

}