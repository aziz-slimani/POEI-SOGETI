import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestU1 {
    WebDriver driver;
   public String email ="nabilkeou3@gmail.com";
    public String firstName = "nouha";
    public String lastName = "stephane";
    //public String email = "nouha@gmail.com";
    public String password = "12345";
    public String firstNameAddress = "nouha";
    public String lastNameAddress = "stephane";
    public String address = "12 avenue Napoleon 1";
    public String city = "Pontivy";
    public String state = "California";
    public String postalCode = "95490";
    public String country = "United States";
    public String mobilePhone = "0700006301";
    public String addressAlias = "nabil@gmail.com";
    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void AccountCreationTest(){

        Homepage homepage = new Homepage(driver);
        homepage.openSignInPage()
                .NewAccount(email)
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterPassword(password)
                .enterAdress(address)
                .enterCity(city)
                .selectState(state)
                .enterPostCode(postalCode)
                .enterphonenumber(mobilePhone)
                .enterAlias(addressAlias)
                .validateAcountCreation();
    }

    @Test
    public void VerificationMyAccountHome(){
        Homepage homepage = new Homepage(driver);
        homepage.openSignInPage()
                .login(email,password)
                .openOrderHistoryAndDetails()
                .backToMyAccount()
                .openCreditSlip()
                .backToMyAccount()
                .openAddresses()
                .backToMyAccount()
                .openInformation()
                .backToAccount()
                .openWishlists()
                .backToMyAccount2()
                .openHomeBtn();


    }


    @Test
    public void TestDeleteAddresse(){
        Homepage homepage = new Homepage(driver);
        homepage.openSignInPage()
                .login(email,password)
                .openOrderHistoryAndDetails()
                .backToMyAccount()
                .openCreditSlip()
                .backToMyAccount()
                .openAddresses()
                .deleteAddress();


    }




}


