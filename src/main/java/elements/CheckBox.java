package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utils.Drivers.driver;

public class CheckBox {

    public static By CheckBoxButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Check Box')]");
    public static By clickArrow = By.xpath("//button[@title='Toggle']");
    public static By checkDesktopCheckBox = By.xpath(" //span[contains(text(),'Desktop')]");
    public static By desktopText = By.xpath("//button[@title='Toggle']");


    public static void openCheckBox() {
        ElementHandler.clickElement(CheckBoxButton);

    }

    public static void openArrow() {
        ElementHandler.clickElement(clickArrow);

    }

    public static void checkDesktop() {
        ElementHandler.clickElement(checkDesktopCheckBox);

    }

    public static void displayMessage() {
        WebElement textFromDesktopCheckbox = driver.findElement(desktopText);
        List<WebElement> list = textFromDesktopCheckbox.findElements(By.xpath("./child::*"));
        for (WebElement desktopCheckbox : list) {
            System.out.println(desktopCheckbox.getText());
        }

    }

}
