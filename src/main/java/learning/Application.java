package learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {
//TO DO

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }

    public static void start() {
//        System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.set(new ChromeDriver(options));
    }
    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver(),4);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }




    public static void close() {
        driver().quit();
    }

  }
