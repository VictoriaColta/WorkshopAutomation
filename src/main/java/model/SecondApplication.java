package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondApplication {

  private static final String link = "https://demoqa.com/";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        //TO DO: Set the path to driver - fill where is necessary
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver111.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox");
        options.addArguments("start-maximized");
        options.addArguments("disable-dev-shm-usage");
        options.addArguments("window-size=1920x1080");
        options.addArguments("proxy=null");

        driver.set(new ChromeDriver(options));

        //TO DO: Set the URL
        driver().get(link);


    }
    public static void backFromBrowser() {
        //Write your code here to close the driver
        driver().navigate().back();
    }
    public static void close() {
        //Write your code here to close the driver
        driver().close();
    }
}
