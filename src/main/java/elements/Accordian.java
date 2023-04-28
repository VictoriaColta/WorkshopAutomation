package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static model.ApplicationNumberTwo.driver;





//cerinta_10:
//        Step 1: Click pe Widgets de pe pagina principala
//        Step 2: Click pe "Accordion" din lista
//        Step 3: Sa se creeze o metoda prin care se verifica textul dinauntru "Why do we use it?"
//        Step 4: In test, sa ve face check numai la textul din interior, actiunea de a inchide si deschide accordion-ul
//        se va face inauntru metodei de getTextWhyDoWeUseIt sau orice denumire doriti.

//"Why do we use it?" field nu este collapsed cand intram pe pagina. In DOM apare: class="collapse"
//Dupa ce dau click pe field si il maresc, in DOM apare: class="collapse show"



public class Accordian {

    public static By thirdField = By.id("section3Heading");
    public static By thirdFieldContent = By.id("section3Content");


// metoda in care am verificat daca field-ul este collapsed sau nu. Dupa care am dat click

    public static boolean isFieldWhyDoWeUseItCollapsed() {

        WebElement element = driver().findElement(thirdField);
        String checkClass = element.getAttribute("class");

        if(checkClass.contains("show")) {
            return true;
        } else {
            return false;
        }
    }

    public static void clickThirdField() {

        WebElement element = driver().findElement(thirdField);
        element.click();
    }

    public static String getThirdFieldContentAfterWaitingThreeSeconds() {

        WebElement element = driver().findElement(thirdFieldContent);

        // Pt a face scroll up am folosit :
        JavascriptExecutor js = (JavascriptExecutor) driver();
        js.executeScript("window.scrollBy(0,-250)");

        WebDriverWait wait = new WebDriverWait(driver(), 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(thirdFieldContent));


        return element.getText();

    }



}
