package testsPractice.Selenium;

import elements.AlertsFrames;
import elements.HomePage;
import model.Application;
import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POM_Frames {
//    cerinta_5
//    Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//    Step 2: Click pe "Frames" din lista
//    Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String

    @Test
    public void testPOM_Frames() {
        SecondApplication.start();

//         Step 1:
        HomePage.clickOnAlertsSection();

        //    Step 2:
        AlertsFrames.clickFrameButton();

        //    Step 3:
        AlertsFrames.getText();

        SecondApplication.close();
    }

    public static class FindAndGet {

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
}
