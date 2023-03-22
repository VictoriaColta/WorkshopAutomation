package testsPractice;

import elements.DragAndDropElements;
import elements.FindAndSendElements;
import model.Application;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POM_DragAndDrop {
    @Test
    public void testPOM() {
        Application.start();

        DragAndDropElements.clickOnDragAndDropPage();
        DragAndDropElements.dragAndDrop();

        Application.close();
    }
}
