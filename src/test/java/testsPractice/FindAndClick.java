package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndClick {

    private final By addElement = By.xpath("//a[@href='/add_remove_elements/']");
    private final By elementButton = By.xpath("//button[@onclick='addElement()']");


    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web

        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://the-internet.herokuapp.com/");

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement

        WebElement element = Application.driver().findElement(addElement);


        //Face click pe acel element
        element.click();

        //Cauta butonul "Add Element" si fa click pe el
        WebElement addElement = Application.driver().findElement(elementButton);

        addElement.click();


        //Inchide applicatia
        Application.close();

    }

}
