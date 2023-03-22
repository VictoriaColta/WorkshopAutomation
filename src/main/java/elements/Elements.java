package elements;

import model.Application;
import org.openqa.selenium.By;

public class Elements {
    private static By textBoxHeader = By.xpath("//div[@class='main-header']");

    private static By textBoxButton = By.xpath("//span[text()='Text Box']");

    public static void clickHeader(){
        Application.driver().findElement(textBoxHeader).click();
    }

    public static void clickTextBox(){
        Application.driver().findElement(textBoxButton).click();
    }
}
