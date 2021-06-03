package commun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class GeneralFunction {

    static WebDriver driver;

    public GeneralFunction() { }

    public static void waitUntilVisible(By element, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static void waitUntilIsClickable(By element, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void log(String log) {
        System.out.println(log);


    public static void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static WebDriver getWebDriver(){
        return driver;

    }
}
