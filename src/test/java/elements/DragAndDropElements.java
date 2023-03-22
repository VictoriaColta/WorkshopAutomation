package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDropElements {
    private static By dragAndDropPageElement = By.xpath("//a[normalize-space()='Drag and Drop']");
    private static By draggableElement = By.id("column-a");
    private static By droppableElement = By.id("column-b");


    public static void clickOnDragAndDropPage() {

        WebElement dragAndDropPage = Application.driver().findElement(dragAndDropPageElement);
        dragAndDropPage.click();
    }

    public static void dragAndDrop() {
        WebDriver driver = Application.driver();
        Actions actions = new Actions(driver);

        WebElement elementToDrag = Application.driver().findElement(draggableElement);
        WebElement placeToDrag = Application.driver().findElement(droppableElement);

        actions.dragAndDrop(elementToDrag,placeToDrag).perform();
    }


}
