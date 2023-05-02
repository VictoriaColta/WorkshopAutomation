package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class FramesPage {
    public static By frames = By.xpath("//*[text()='Frames']");
    public static By textLocator = By.id("frame1");

    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        element.click();
    }

    public static void getText(By locator) {
        WebElement iFrame = driver().findElement(locator);
        driver().switchTo().frame(iFrame);
        String textFrameOne = driver().findElement(By.id("sampleHeading")).getText();
        System.out.println(textFrameOne);
    }
}
