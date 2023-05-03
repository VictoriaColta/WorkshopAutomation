package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cerinta5 {
    // test
    //cerinta_5
    //                Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
    //                Step 2: Click pe "Frames" din lista
    //                Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By alertsMenu = By.xpath("//div[@class='card-body']//*[text()='Alerts, Frame & Windows']");
    private static By frames = By.xpath("//*[@id=\"item-2\"]/span[@class='text' and contains (text(), \"Frames\")]");
    public static By frameText = By.xpath("//h1[@id='sampleHeading']");
 @Test
    public void testCerinta5(){

     Application.start();
     //                Step 1: Click pe Elements de pe pagina principala
     JavascriptExecutor js = (JavascriptExecutor) Application.driver();
     WebElement Element = Application.driver().findElement(elementsMenu);
     js.executeScript("arguments[0].scrollIntoView();", Element);
     Application.driver().findElement(alertsMenu).click();

     //                Step 2: Click pe "Frames" din lista
     Application.driver().findElement(frames).click();

     //                Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String
     Application.driver().switchTo().frame(0);
     WebElement frame = Application.driver().findElement(frameText);
     String frameText = frame.getText();
     System.out.println(frameText);


     Application.close();
 }
}
