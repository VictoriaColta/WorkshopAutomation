package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static model.ApplicationNumberTwo.driver;


//  cerinta_12:
//          Step 1: Click pe Interactions de pe pagina principala
//          Step 2: Click pe "Sortable" din lista
//          Step 3: Sorteaza lista in formatul urmator Six, One, Five, Three, Four, Two


public class Interactions {

    public static By sortable = By.xpath("//span[text()='Sortable']");

    public static void clickSortable() {

        WebElement element = driver().findElement(sortable);
        element.click();

    }

}
