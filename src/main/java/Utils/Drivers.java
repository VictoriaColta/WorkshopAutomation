package Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static model.Application.driver;


public class Drivers {

    public static WebDriver driver;
    public static String url = "https://demoqa.com/";

    public static void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\WorkshopAutomation\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
  }
    public static void close() {
        driver().close();
        driver().quit();

    }

}

