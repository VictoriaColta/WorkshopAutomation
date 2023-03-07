package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Cerinta2 {
    /*Folosind model/Application.java, sa se deschida aplicatia https://demoqa.com/
            cerinta_2:
                Step 1: Click pe Elements de pe pagina principala
                Step 2: Click pe Check Box din lista
                Step 3: Expand Home prin click pe sageata
                Step 4: Click pe checkbox-ul aferent "Desktop"
                Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
    */

    @Test
    public void testCerinta2(){
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/");

        WebElement btnElements = driver.findElement(By.xpath("//*[@class=\"card mt-4 top-card\"][1]"));
        btnElements.click();

        WebElement btnCheckBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
        btnCheckBox.click();

        WebElement arrowHome = driver.findElement(By.xpath("//span[text()='Home']/ancestor::*[@class='rct-text']/descendant::button"));
        arrowHome.click();

        WebElement checkBoxDesktop = driver.findElement(By.xpath("//span[text()='Desktop']/preceding-sibling::span[@class='rct-checkbox']"));
        checkBoxDesktop.click();

        List<WebElement> messageElement = driver.findElements(By.xpath("//span[contains(text(),'You have selected :')]/following-sibling::span"));

        String messageText = "";
        for (WebElement selectedElement : messageElement) {
            messageText += selectedElement.getText() + " ";
        }
        messageText = messageText.trim();

        Assert.assertEquals(messageText, "desktop notes commands");
        System.out.println("Message: " + messageText);

        Application.close();
    }
}
