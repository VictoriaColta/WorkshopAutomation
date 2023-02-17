package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static model.Application.driver;

public class DragAndDrop {
    /**
     * Pentru acest test se va folosi alt site
     * Pentru ca se v-a folosi alt site va trebui initializat driver aici
     * WebDriver driver = new ChromeDriver();
     * System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
     * driver.get("https://demoqa.com/droppable/");
     * driver.manage().window().maximize();
     *******/

    @Test
    public  void dragAndDrop() {

//Deschidem aplicatia web in browser avand pagina dorita in URL https://demoqa.com/droppable/
//Creeam un obiect din clasa Actions
//Indentificam elementele cu care vom interactiona
//Apelam metoda dragAndDrop folosind obiectul creat


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String link = "https://demoqa.com/droppable/";

        driver.get(link);
        driver.manage().window().maximize();

        Actions performAction = new Actions(driver);
        WebElement dragBox = driver.findElement(By.id("draggable"));

        WebElement dropBox = driver.findElement(By.id("droppable"));

        performAction.dragAndDrop(dragBox,dropBox).perform();

// Printeaza in consola mesajul care apare dupa ce se face drag and drop

        String message = driver.findElement(By.id("droppable")).getText();

        System.out.println("This is the message : " + message);

        driver.close();
    }
}
