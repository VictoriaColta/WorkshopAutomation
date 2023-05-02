package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.Application.driver;

public class AddRemovePage {

    public static By addRemoveSection = By.xpath("//a[@href='/add_remove_elements/']");
    public static By addElementButton = By.xpath("//button[@onclick='addElement()']");
    public static By deleteButton = By.xpath("//button[@class='added-manually']");

    public static void clickAddRemove() {
        driver().findElement(addRemoveSection).click();
    }

    public static void clickAddElement() {
        driver().findElement(addElementButton).click();
    }

    public static void checkIfDeleteButtonIsDisplayed() {
        boolean checkDeleteButton = driver().findElement(deleteButton).isDisplayed();
        System.out.println("Delete button is present" + " = " + checkDeleteButton);
    }

    public static void clickDeleteButton() {
        driver().findElement(deleteButton).click();
    }

    public boolean checkThatDeleteButtonIsNotDisplayed() {
        {
            try {
                WebElement button = driver().findElement(deleteButton);
                if (button.isDisplayed()) {
                    return true;
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Delete button not found");
                return false;
            }
            return false;
        }
    }
}
