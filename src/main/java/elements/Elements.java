package elements;

import org.openqa.selenium.By; // here, "org.openqa.selenium" is a package and "By" is a class
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

public class Elements {

    // locators
    private static By textBoxLocator = By.xpath("(//li[@id='item-0'])[1]");
    private static By checkBoxLocator = By.xpath("(//li [@id ='item-1'])[1]");
    private static By webTablesLocator = By.xpath("(//li [@id ='item-3'])[1]");

    public static void clickTextBox() {

        WebElement textBox = driver().findElement(textBoxLocator);
        textBox.click();
    }
    public static void clickCheckBox() {
        WebElement checkBox = driver().findElement(checkBoxLocator);
        checkBox.click();
    }

    public static void clickWebTables() {
        WebElement webTables = driver().findElement(webTablesLocator);
        webTables.click();
    }
}