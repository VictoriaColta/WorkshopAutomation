package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FindAndClick {

    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement btnAddElementPage = Application.driver().findElement(By.xpath("//a[@href='/add_remove_elements/']"));

        //Face click pe acel element
        btnAddElementPage.click();

        //Cauta butonul "Add Element" si fa click pe el
        WebElement addElementButton = Application.driver().findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        assertTrue(Application.driver().findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed());

        //Inchide applicatia
        Application.close();
    }
}
