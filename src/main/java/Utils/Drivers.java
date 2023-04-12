package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {

    public static WebDriver driver;
    public static String url = "https://demoqa.com/";

    public static void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\WorkshopAutomation\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
    }
}

