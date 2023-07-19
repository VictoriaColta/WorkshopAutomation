package testsPractice.Selenium;

import elements.DragAndDrop;
import model.Application;
import org.testng.annotations.Test;

public class POM_DragAndDrop {
    @Test
    public void testPOM() {
        Application.start();

        DragAndDrop.clickOnDragAndDropPage();
        DragAndDrop.dragAndDrop();

        Application.close();
    }
}
