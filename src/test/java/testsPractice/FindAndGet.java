package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FindAndGet {
    @Test
    public void findElementAndGetText() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un element (text) si il salveaza intr-o variabila
        WebElement title = Application.driver().findElement(By.xpath("//*[@id=\"content\"]/h1"));
        String titleText = title.getText();

        //Printeaza acel text in consola
        System.out.println("Title text : " + titleText);
        Assert.assertEquals(titleText, "Welcome to the-internet");

        //Inchide applicatia
        Application.close();
    }
}
