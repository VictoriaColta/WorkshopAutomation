package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {
//TO DO
    private static final String link = "The link to the site";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        //TO DO: Set the path to driver - fill where is necessary
        System.setProperty("webdriver.chrome.driver", "The location folder of driver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.set(new ChromeDriver(options));

        //TO DO: Set the URL
        driver().get("");


    }

    public static void close() {
        //Write your code here to close the driver

    }

  }
