package learning.model.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static learning.Application.driver;
import static learning.Application.waitUntilElementIsVisible;

public class Widgets {
   public static By widgets = By.xpath("//*[text()=\"Widgets\"]");
    public static By accordion= By.xpath("//*[text()='Accordian']");

    public static void clickWidgetsSubcategory() {

        WebElement element = driver().findElement(widgets);
        waitUntilElementIsVisible(element);
        element.click();
    }
    public static void clickAccordion(){
        WebElement element = driver().findElement(accordion);
        waitUntilElementIsVisible(element);
        element.click();
    }
    public static String retrieveWhyDoWeUseItText(){
        WebElement element = driver().findElement(By.id("section3Heading"));
        waitUntilElementIsVisible(element);
        element.click();

        element= driver().findElement(By.id("section3Content"));
        waitUntilElementIsVisible(element);

        return element.getText();
    }
}


