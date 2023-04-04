package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static model.Application.driver;

public class FindAndClickElements {
    // locators

    private static By addRemoveElementPage = By.xpath("//a[@href='/add_remove_elements/']");
    private static By addElement = By.xpath("//button[@onclick='addElement()']");
    private static By deleteElement = By.xpath("//div[@id='elements']//button[1]");

    public static void clickElementFromTextBox() {
        WebElement addRemoveElementButton = driver().findElement(addRemoveElementPage);

        addRemoveElementButton.click();
    }
    public static void clickAddElement() {
        WebElement addButton = driver().findElement(addElement);

        addButton.click();
    }
    public static void clickDeleteButton() {
        WebElement deleteButton = driver().findElement(deleteElement);

        deleteButton.click();
    }

    public static void deleteButtonIsDisplayed() {
        WebElement deleteButton = driver().findElement(deleteElement);

        Assert.assertTrue(deleteButton.isDisplayed());
    }

    public static void deleteButtonIsNotDisplayed() {
        WebElement deleteButton = driver().findElement(deleteElement);

        Application.driver().findElement(deleteElement);
    }
}
