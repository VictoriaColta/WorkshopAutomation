package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class FindAndClick {

    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement addRemoveButton = Application.driver().findElement(By.xpath("//a[@href='/add_remove_elements/']"));


        //Face click pe acel element
        addRemoveButton.click();

        //Cauta butonul "Add Element" si fa click pe el
        WebElement addElementButton = Application.driver().findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        //Inchide applicatia
        Application.close();


    }

}
