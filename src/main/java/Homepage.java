import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage {

    WebDriver driver;

    public Homepage (WebDriver driver) {
        this.driver = driver;
    }

    By ResearchBar = By.cssSelector("#search_query_top");
    By LoopSearch = By.name("[name = 'submit_search']");
    By SignIn = By.cssSelector(".login");
    By cartElement = By.cssSelector("[title ='View my shopping cart']");
    By logoelement = By.cssSelector(".logo.img-responsive");


    public void openSignInPage() {


        driver.findElement(SignIn).click();
    }

    public void searchArticles ( String articleToSearch){


        driver.findElement(ResearchBar).sendKeys(articleToSearch);
        driver.findElement(LoopSearch).click();

    }

    public void addToCard() {
        driver.findElement(cartElement).click();

    }

    public void viewArticles(int index){


        List<WebElement> listArticles = driver.findElements(By.cssSelector("[itemprop='image']"));
        listArticles.get(index).click();
    }

    public void ReturnHomePageFromLogo() {

        driver.findElement(logoelement).click();
        //assert//
    }
}