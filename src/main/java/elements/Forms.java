package elements;

// Cerinta extra:
// Introdu input-uri  in field-urile de pe pagina. Activeaza radio buttons. Adauga un fisier. Selecteaza din dropdown. Click pe submit

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

// Work in progress

public class Forms {

    public static By practiceFormsLocator = By.xpath("//span[text()='Practice Form']");

    public static void clickPracticeForm() {

        WebElement element = driver().findElement(practiceFormsLocator);
        element.click();
    }
}
