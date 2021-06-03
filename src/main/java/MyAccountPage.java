import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By OrderHistoryBtn = By.cssSelector("[title='Orders']");
    By CreditSlipBtn = By.cssSelector("[title='Credit slips']");
    By AddressesBtn = By.cssSelector("[title='Addresses']");
    By InformationBtn = By.cssSelector("[title='Information']");
    By WishlistsBtn = By.cssSelector("[title='My wishlists']");
    By HomeBtn = By.cssSelector("[title='Home']");
    By InputSearch = By.id("search_query_top");
    By btnSearch = By.cssSelector("[name='submit_search']");
    By ShoppingCartBtn = By.cssSelector("[title='View my shopping cart']");
    By FirstSuggestion = By.cssSelector(".ac_results>ul>li:nth-of-type(1)");




    public void searchProducts(String motCle) {
        driver.findElement(InputSearch).sendKeys(motCle);
        driver.findElement(btnSearch).click();
    }

    public void searchProductsBySuggestion(String motCle) {

        driver.findElement(InputSearch).sendKeys(motCle);
        commun.GeneralFunction.waitUntilVisible(FirstSuggestion,driver);
        driver.findElement(FirstSuggestion).click();
    }
    public CartPage openShoppingCart() {
        driver.findElement(ShoppingCartBtn).click();
        return new CartPage(driver) ; // a verifier
    }

    public OrderHistoryPage openOrderHistoryAndDetails() {
        driver.findElement(OrderHistoryBtn).click();
        return new OrderHistoryPage(driver) ;
    }

    public creditSlipsPage openCreditSlip() {
        driver.findElement(CreditSlipBtn).click();
        return new creditSlipsPage(driver) ;

    }

    public MyAddresses openMyAresses() {
        driver.findElement(AddressesBtn).click();
        return new MyAddresses(driver) ;
    }

    public PersonalInfoPage openInformation() {
        driver.findElement(InformationBtn).click();
        return new PersonalInfoPage(driver);
    }

    public WishListPage openWishlists() {
        driver.findElement(WishlistsBtn).click();
        return new WishListPage(driver);
    }

    public Homepage openHomeBtn() {
        driver.findElement(HomeBtn).click();
        return new Homepage(driver);
    }



}

