package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

public class Widgets {

    public static By datePicker = By.xpath("//*[text()='Date Picker']");

    public static void click(By locator) {

        WebElement element = driver().findElement(locator);
        element.click();
    }
}
