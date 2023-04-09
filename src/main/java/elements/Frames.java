package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static model.ApplicationNumberTwo.driver;

public class Frames {

    public static By textLocator = By.id("frame1");

    public static void getText(By locator) {

        WebElement iFrame = driver().findElement(locator);
        driver().switchTo().frame(iFrame);
        String textFrameOne = driver().findElement(By.id("sampleHeading")).getText();
        System.out.println(textFrameOne);
    }
}
