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

    public void openShoppingCart() {
        driver.findElement(ShoppingCartBtn).click();
    }

    public void openOrderHistoryAndDetails() {
        driver.findElement(OrderHistoryBtn).click();
    }

    public void openCreditSlip() {
        driver.findElement(CreditSlipBtn).click();
    }

    public void openAddresses() {
        driver.findElement(AddressesBtn).click();
    }

    public void openInformation() {
        driver.findElement(InformationBtn).click();
    }

    public void openWishlists() {
        driver.findElement(WishlistsBtn).click();
    }

    public void openHomeBtn() {
        driver.findElement(HomeBtn).click();
    }



}

