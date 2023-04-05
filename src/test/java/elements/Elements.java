package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static model.SecondApplication.driver;
public class Elements {
    // locators
    private static By textBoxElement = By.xpath("(//li[@id='item-0'])[1]");
    private static By checkBoxElement = By.xpath("(//li[@id ='item-1'])[1]");
    private static By webTablesElement = By.xpath("(//li[@id ='item-3'])[1]");
    private static By uploadsAndDownloadsElement = By.id("item-7");

    public static void clickTextBox() {

        WebElement textBox = driver().findElement(textBoxElement);
        textBox.click();
    }
    public static void clickCheckBox() {
        WebElement checkBox = driver().findElement(checkBoxElement);
        checkBox.click();
    }

    public static void clickWebTables() {
        WebElement webTables = driver().findElement(webTablesElement);
        webTables.click();
    }


    public static void clickUploadsAndDownloads() {
        WebElement uploadsAndDownloads = driver().findElement(uploadsAndDownloadsElement);
        uploadsAndDownloads.click();
    }
    public static void validateTextBoxDisplayed() {

        WebElement textBoxSection = driver().findElement(textBoxElement);
        Assert.assertTrue(textBoxSection.isDisplayed());

    }
}
