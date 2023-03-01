package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static model.Application.driver;

public class FindAndGet {

    @Test
    public void findAndGet() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un element (text) si il salveaza intr-o variabila
        WebElement contextMenu = Application.driver().findElement(By.xpath("//a[@href='/context_menu']"));
        contextMenu.click();
        WebElement contextMenuTitle = Application.driver().findElement(By.xpath("//h3[text()='Context Menu']"));

        //Printeaza acel text in consola
        System.out.println(contextMenuTitle.getText());

        //Inchide applicatia
        Application.close();
    }

}
