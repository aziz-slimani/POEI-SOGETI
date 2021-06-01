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



    public void searchProducts(String motCle) {
        driver.findElement(InputSearch).sendKeys(motCle);
        driver.findElement(btnSearch).click();
    }

    public void clickOnShoppingCart() {
        driver.findElement(ShoppingCartBtn).click();
    }

    public void clickOnOrderHistoryAndDetails() {
        driver.findElement(OrderHistoryBtn).click();
    }

    public void clickOnCreditSlip() {
        driver.findElement(CreditSlipBtn).click();
    }

    public void clickOnAddresses() {
        driver.findElement(AddressesBtn).click();
    }

    public void clickOnPersonalInformation() {
        driver.findElement(InformationBtn).click();
    }

    public void clickOnWishlists() {
        driver.findElement(WishlistsBtn).click();
    }

    public void clickOnHomeBtn() {
        driver.findElement(HomeBtn).click();
    }


}
