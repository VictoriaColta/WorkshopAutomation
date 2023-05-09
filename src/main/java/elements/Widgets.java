package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

public class Widgets {

    public static By datePicker = By.xpath("//*[text()='Date Picker']");
    public static By accordian = By.xpath("//span[text()='Accordian']");
    public static By slider = By.xpath("//span[text()='Slider']");

    public static void click(By locator) {

        WebElement element = driver().findElement(locator);
        element.click();
    }

    public static void clickAccordian() {

        WebElement element = driver().findElement(accordian);
        element.click();
    }

    public static void clickSlider() {

        WebElement element = driver().findElement(slider);
        element.click();
    }
}
