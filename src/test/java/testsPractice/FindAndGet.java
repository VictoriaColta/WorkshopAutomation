package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindAndGet {
    @Test
    public void findAndGet() {
        //Deschide browser si deschide applicatia web
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://the-internet.herokuapp.com/");


        //cauta un element (text) si il salveaza intr-o variabila
        WebElement elem=Application.driver().findElement(By.xpath("//*[@id=\"content\"]/h2"));
        String out= elem.getText();

        //Printeaza acel text in consola
        System.out.println(out);

        //Inchide applicatia
        Application.driver().close();
    }
}
