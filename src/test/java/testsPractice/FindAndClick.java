package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

        WebElement checkboxesElement = Application.driver().findElement(By.xpath("//a[@href='/checkboxes']"));

//Face click pe acel element

        checkboxesElement.click();

//Cauta butonul "Add Element" si fa click pe el// poate fi si butonul de checkbox din pagina deschisa

        WebElement checkBoxOne = Application.driver().findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        checkBoxOne.click();

//Inchide applicatia

        Application.close();

    }
}
