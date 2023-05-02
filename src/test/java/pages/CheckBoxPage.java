package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class CheckBoxPage {
    public static By checkBoxSection = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
    public static By toggle = By.xpath("//button[@aria-label='Toggle']");
    public static By desktop = By.xpath("(//span[@class='rct-checkbox'])[2]");
    public static By text = By.id("result");

    public static void clickCheckBoxSection() {
        driver().findElement(checkBoxSection).click();
    }

    public static void clickToogle() {
        driver().findElement(toggle).click();
    }

    public static void clickDesktopCheckBox() {
        driver().findElement(desktop).click();
    }

    public static void getText() {
        String textMessage = driver().findElement(text).getText();
        System.out.println("Textul generat este: " + textMessage);
    }

}
