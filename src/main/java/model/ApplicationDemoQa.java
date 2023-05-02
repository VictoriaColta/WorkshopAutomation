package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationDemoQa {
    private static final String link = "https://demoqa.com/";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver.set(new ChromeDriver(options));
        driver().get(link);
    }

    public static void close() {
        driver().quit();
    }
}
