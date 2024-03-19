package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static model.SecondApplication.driver;

public class AlertsFrames {
    private static By frameButtonElement = By.xpath("//span[normalize-space()='Frames']");
    private static By iFrameElement = By.id("frame1");

    public static By alertsLocator = By.xpath("//span[text()='Alerts']");



    public static void clickAlerts() {

        WebElement element = driver().findElement(alertsLocator);
        element.click();
    }
    public static void clickFrameButton() {

        WebElement frameButton = driver().findElement(frameButtonElement);
       frameButton.click();

    }
    public static void getText() {

        WebElement iFrame = driver().findElement(iFrameElement);
        driver().switchTo().frame(iFrame);
        System.out.println( iFrame.getText());
    }
}