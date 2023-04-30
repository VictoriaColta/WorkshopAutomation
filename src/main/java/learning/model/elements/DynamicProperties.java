package learning.model.elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static learning.Application.driver;

public class DynamicProperties {

    public static By dynamicProperties = By.xpath("//*[text()=\"Dynamic Properties\"]");
    public static By visibleAfter5SecondsButton = By.xpath("//*[text()=\"Visible After 5 Seconds\"]");
    public static By colorChangeButton = By.xpath("//*[text()=\"Color Change\"]");

    public static void dynamicPropertiesClick() {
        WebDriver driver = driver();
        WebElement element = driver().findElement(dynamicProperties);
        element.click();
    }

    public static boolean isButtonVisibleAfter5Seconds() {
        WebDriverWait wait = new WebDriverWait(driver(), 6);

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(visibleAfter5SecondsButton));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    public static String getColorFromButton() {
        WebElement element = driver().findElement(colorChangeButton);
        return element.getCssValue("color").toString();
    }
}
