package elements;


// cerinta_8:
//Step 1: Click pe Elements de pe pagina principala
//Step 2: Click pe "Dynamic properties" din lista
//Step 3: Verificat ca butonul cu textul "Visible After 5 Seconds" apare dupa 5 secunde, inclusiv schimbare culorii de la butonul
//"Color change"

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static model.ApplicationNumberTwo.driver;

public class DynamicProperties {

    public static By visibleAfterButton = By.id("visibleAfter");
    public static By colorChangeButton = By.xpath("//button[@class='mt-4 text-danger btn btn-primary']");

    // metoda care verifica daca butonul va aparea in 5 secunde. Am folosit Explicit wait.

    public static boolean isFiveSecondsButtonVisibleAfter(int value) {

        WebDriverWait wait = new WebDriverWait(driver(), value);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfterButton));

        } catch (TimeoutException exception) {

            return false;
        }
        return true;

    }

    public static boolean isColorChanged() {

        WebElement element = driver().findElement(colorChangeButton);
        String elementClass = element.getAttribute("class");
        return elementClass.contains("text-danger");

// returnul de mai sus poate fi scris si asa :
// return element.getAttribute("class").contains("text-danger");

    }

}

//cand asteptam sa se returneze o valoare (boolean,int etc) folosim blocul de try0catch. In try verificam vizibilitatea, daca  nu ,se va duce
// pe cazul  "catch". La final punem return "true"
// return opreste executia metodei

// metoda "until" - arunca exceptiA "Timeout Exception" daca nu gaseste elementul dupa ce trec nr de secunde specificate
// in "try" pun apelurile de metode care pot arunca exceptii


// vizibilitatea unui buton pe loc: folosim exceptii
//         mai multe exceptii, mai multe blocuri de catch







// Incercari


//        //identific butonul "color change"
//        WebElement button = driver().findElement(By.id("colorChange"));
//        // obtin culoarea in rgba
//        String cssColorString = button.getCssValue("color");
//        //convert rgba to hex
//        Color color = Color.fromString(cssColorString);
//        System.out.println(color.asHex());
//        String[] rgba = cssColorString.replace("rgba(", "").replace(")", "").split(", ");
//        int r = Integer.parseInt(rgba[0]);
//        int g = Integer.parseInt(rgba[1]);
//        int b = Integer.parseInt(rgba[2]);
//        int a = Integer.parseInt(rgba[3]);
//
//        Color color2 = new Color(r, g, b, a);
//        System.out.println(color2.asHex());


//        Color colorChangeButton = Color.fromString(driver().findElement(By.id("colorChange")).getCssValue("color"));
////        System.out.println(colorChangeButton);
//        System.out.println(colorChangeButton.asHex());
//        String[] rgba = colorChangeButton.replace("rgba(", "").replace("")
