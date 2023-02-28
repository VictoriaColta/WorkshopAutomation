package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FindAndGet {

    @Test
    public void findAndGet() {


        //Deschide browser si deschide applicatia web
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://the-internet.herokuapp.com/abtest");

        //cauta un element (text) si il salveaza intr-o variabila

        WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Also known as split testing. This is a way in whic')]"));

        //Printeaza acel text in consola

        System.out.println("Print text " + text.getText());
        //Inchide applicatia
        Application.close();
    }
}
