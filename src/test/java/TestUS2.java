import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestUS2 {
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
    public void correctLogin() {
        // Arrange
        String userName = "kakmenikoeu@gmail.com";
        String password = "12345";
        // Act
        Homepage homePage = new Homepage(driver);
        homePage.openSignInPage()
                .login("kakmenikoeu@gmail.com", "12345");
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