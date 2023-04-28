package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.Drivers.driver;

public class AlertsFrameWindows {

    public static By framesButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Frames')]");
    public static By iframeText = By.xpath("//h1[@id='sampleHeading']");

    public static void saveTextFromIframes() {
        ElementHandler.clickElement(framesButton);
        driver.switchTo().frame(0);
        WebElement iframe = driver.findElement(iframeText);
        String iframeText = iframe.getText();
        System.out.println(iframeText);
    }

}
