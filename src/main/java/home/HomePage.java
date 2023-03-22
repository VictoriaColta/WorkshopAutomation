package home;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

public class HomePage {
    static WebElement elementsButton = Application.driver().findElement(By.xpath("//h5[text()='Elements']"));

    public static void clickElements() {
        ((JavascriptExecutor) Application.driver()).executeScript("arguments[0].scrollIntoView(true);", elementsButton);
        elementsButton.click();
    }
}
