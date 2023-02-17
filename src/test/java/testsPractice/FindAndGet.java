package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindAndGet {
        @Test
        public void findElementAndGet() {

//Deschide browser si deschide applicatia web

        Application.start();

//cauta un element (text) si il salveaza intr-o variabila

        String textTitle = Application.driver().findElement(By.xpath("//h1[@class='heading']")).getText();


//Printeaza acel text in consola

        System.out.println("The text is:   " + textTitle);

//Inchide aplicatia

        Application.close();
    }
}
