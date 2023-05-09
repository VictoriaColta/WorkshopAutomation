package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationNumberTwo {

    private static final String linkToSite = "https://demoqa.com/";

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }

    public static void start() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver111.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.set(new ChromeDriver(options));
        driver().get(linkToSite);

//        driver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void close() {
        driver().close();

    }
}
