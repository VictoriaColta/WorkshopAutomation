package elements;

import org.openqa.selenium.By; // here, "org.openqa.selenium" is a package and "By" is a class
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//A doua rezolvare

public class Elements {

    public static By checkBox = By.xpath("//*[text()='Check Box']");
    public static By textBox = By.xpath("(//li[@id='item-0'])[1]");
    public static By webTables = By.xpath("//span[text()='Web Tables']");
    public static By uploadAndDownload = By.xpath("//span[text()='Upload and Download']");

    public static void click(By locator) {

        WebElement tabFromElements = driver().findElement(locator);
        tabFromElements.click();

    }

}

// Prima rezolvare

//public class Elements {
//
//    // locators
//    private static By textBoxLocator = By.xpath("(//li[@id='item-0'])[1]");
//    private static By checkBoxLocator = By.xpath("(//li [@id ='item-1'])[1]");
//    private static By webTablesLocator = By.xpath("(//li [@id ='item-3'])[1]");
//
//    public static void clickTextBox() {
//
//        WebElement textBox = driver().findElement(textBoxLocator);
//        textBox.click();
//    }
//    public static void clickCheckBox() {
//        WebElement checkBox = driver().findElement(checkBoxLocator);
//        checkBox.click();
//    }
//
//    public static void clickWebTables() {
//        WebElement webTables = driver().findElement(webTablesLocator);
//        webTables.click();
//    }
//}