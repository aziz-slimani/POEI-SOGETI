import commun.GeneralFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    By Logo = By.cssSelector("#header_logo") ;
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
        GeneralFunction.log("Cart page is opened successfully");
        return new CartPage(driver) ;
    }

    public OrderHistoryPage openOrderHistoryAndDetails() {
        commun.GeneralFunction.waitUntilIsClickable(OrderHistoryBtn,driver);
        driver.findElement(OrderHistoryBtn).click();
        GeneralFunction.log("OrderHistoryAndDetails page is opened successfully");
        return new OrderHistoryPage(driver) ;
    }

    public creditSlipsPage openCreditSlip() {
        commun.GeneralFunction.waitUntilIsClickable(CreditSlipBtn,driver);
        driver.findElement(CreditSlipBtn).click();
        GeneralFunction.log("CreditSlip page is opened successfully");
        return new creditSlipsPage(driver) ;

    }

    public MyAddresses openMyAresses() {
        commun.GeneralFunction.waitUntilIsClickable(AddressesBtn,driver);
        driver.findElement(AddressesBtn).click();
        return new MyAddresses(driver) ;
    }

    public PersonalInfoPage openInformation() {
        commun.GeneralFunction.waitUntilIsClickable(AddressesBtn,driver);
        driver.findElement(AddressesBtn).click();
        GeneralFunction.log("Personal Information page is opened successfully");
        return new PersonalInfoPage(driver);
    }

    public WishListPage openWishlists() {
        commun.GeneralFunction.waitUntilIsClickable(WishlistsBtn,driver);
        driver.findElement(WishlistsBtn).click();
        GeneralFunction.log("Wishlists page is opened successfully");
        return new WishListPage(driver);
    }

    public Homepage openHomeBtn() {
        commun.GeneralFunction.waitUntilIsClickable(HomeBtn,driver);
        driver.findElement(HomeBtn).click();
        return new Homepage(driver);
    }

    public boolean logoVerification () {
        return driver.findElement(Logo).isDisplayed();
    }


}

