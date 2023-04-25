package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Elements {

    /// Elemente si metode cerinta 1

    private static By addRemoveElements = By.linkText("Add/Remove Elements");
    private static By addElementButton = By.xpath("//button[text()='Add Element']");
    private static By deleteButton = By.xpath("//button[text()='Delete']");


    public static void clickAddRemoveElements () {
        Application.driver().findElement(addRemoveElements).click();
    }
    public static void clickAddElement () {
        Application.driver().findElement(addElementButton).click();
    }
    public static void deleteButtonDisplayed  () {Application.driver().findElement(deleteButton).isDisplayed();}
    public static void clickDeleteButton () {
        Application.driver().findElement(deleteButton).click();
    }

    public static boolean elementVisibilityValidation (By webelement) {
        try {
            Application.driver().findElement(webelement);
                    return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean isDeleteButtonVisible () {

        return elementVisibilityValidation(deleteButton);
    }



}
