package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationHerokuapp {
//TO DO
    private static final String link = "The link to the site";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        //TO DO: Set the path to driver - fill where is necessary
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.set(new ChromeDriver(options));

        //TO DO: Set the URL
        driver().get("https://the-internet.herokuapp.com/");


    }

    public static void close() {
        //Write your code here to close the driver

    }

  }
