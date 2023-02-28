package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
    public void dragAndDrop() {
        //Deschidem aplicatia web in browser avand pagina dorita in URL https://demoqa.com/droppable/
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/droppable/");


        //Creeam un obiect din clasa Actions
        Actions actions = new Actions(driver);

        //Indentificam elementele cu care vom interactiona
        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement placeToDrag = driver.findElement(By.id("droppable"));


        //Apelam metoda dragAndDrop folosind obiectul creat
        actions.dragAndDrop(elementToDrag,placeToDrag).perform();

        driver.close();
    }

}
