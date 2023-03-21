package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

public class HomePage {


    private  static By elementsLocator = By.xpath("(//div[@class = 'avatar mx-auto white']) [1]");

    public static void clickElements () {
        WebElement elements = driver().findElement(elementsLocator);
        elements.click();
    }
}
