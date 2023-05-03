package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.Handler;

public class Elements {

    /// Elemente si metode cerinta 1

    private static By addRemoveElements = By.linkText("Add/Remove Elements");
    private static By addElementButton = By.xpath("//button[text()='Add Element']");
    private static By deleteButton = By.xpath("//button[text()='Delete']");


    public static void clickAddRemoveElements () {Handler.clickElement(addRemoveElements);}
    public static void clickAddElement () {Handler.clickElement(addElementButton);}
    public static void clickDeleteButton () {Handler.clickElement(deleteButton);}
    public static void deleteButtonDisplayed () {Handler.isElementDisplayed(deleteButton);}
    public static boolean isDeleteButtonVisible () {
        return Handler.elementVisibilityValidation(deleteButton);
    }
}
