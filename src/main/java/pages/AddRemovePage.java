package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.Application.driver;

public class AddRemovePage {

    public static By addRemoveSection = By.xpath("//a[@href='/add_remove_elements/']");
    public static By addElementButton = By.xpath("//button[@onclick='addElement()']");
    public static By deleteButton = By.xpath("//button[@class='added-manually']");

    public static void click(By locator) {
        driver().findElement(locator).click();
    }

    public static boolean checkIfDeleteButtonIsDisplayed() {
            try {
                WebElement button = driver().findElement(deleteButton);
                if (button.isDisplayed()) {
                    System.out.println("Delete button is displayed ");
                    return true;
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Delete button not found");
            }
            return false;
    }


}
