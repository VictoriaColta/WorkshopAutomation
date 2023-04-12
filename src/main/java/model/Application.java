package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Application {

    private static final String link = "https://demoqa.com/";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }

    public static void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\WorkshopAutomation\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.set(new ChromeDriver(options));
        driver().get("https://demoqa.com/");

    }
    public static void close() {
        driver().close();
        driver().quit();

    }

  }
