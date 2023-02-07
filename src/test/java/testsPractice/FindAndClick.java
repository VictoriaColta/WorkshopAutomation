package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;

public class FindAndClick {

    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement


        //Face click pe acel element


        //Cauta butonul "Add Element" si fa click pe el



        //Inchide applicatia
        Application.close();


    }

}
