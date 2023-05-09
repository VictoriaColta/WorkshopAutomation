package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static model.ApplicationNumberTwo.driver;


//cerinta_11:
//        Step 1: Click pe Widgets de pe pagina principala
//        Step 2: Click pe "Slider" din lista
//        Step 3: Muta slider-ul la 40, asteapta 3 secunde (puteti folosi thread.sleep) - Important pentru demo
//        Step 4: Verifica valoare de input ca este egala cu 40
//        Step 5: Repeta pasul 3 si 4 pentru valorile, 80, 30, 20, 99, 5, 15, 10


public class Slider {

    public static By slider = By.xpath("//input[@type='range']");


    public static void moveSlider(int value) {

        WebElement element = driver().findElement(slider);
        setHValue(element, value);

    }


    public static void setHValue(WebElement slider, int value) {


        int minValue = Integer.parseInt(slider.getAttribute("min"));// slider.getAttribute imi returna un String, asa ca am facut parseInt pt a-mi returna int
        int maxValue = Integer.parseInt(slider.getAttribute("max"));
        int sliderWidth = slider.getSize().width;
        System.out.println(sliderWidth); // am aflat nr maxim de pixeli de pe orizontala - axa xOffset
        Actions action = new Actions(driver());
        action.clickAndHold(slider);

        // axa este de la 0-min value la 100-max value
        // pt mijlocul axei (50), valorile xOffset si yOffset sunt 0
        // pt a misca slider-ul sub valori mai mici de 50, trebuie ca xOffset sa fie negativ
        // nr maxim de pixeli pe axa orizontala = 528
        // un punct de pe slider pe axa orizontala va avea :
        // sliderWidth (528) / maxValue (100) = 5.28 pixeli

        // Formula pt a afla numarul de pixeli atribuit fiecarui punct de pe slider este:
        // double pixelPoint =  ((double) sliderWidth /  maxValue);

        double pixelPoint = 5.11;

        double pointsToMoveOnSlide = (value - ((maxValue - minValue) / (double) 2));

        double totalPixelForDesiredPoint = (pixelPoint * pointsToMoveOnSlide);

        action.moveByOffset((int) totalPixelForDesiredPoint, 0).build().perform();

    }

    public static String verifySliderValue() throws InterruptedException {

        Thread.sleep(3000); // pt a face pauza 3 secunde intre mutarile slider-ului de la o valoare la alta
        WebElement element = driver().findElement(slider);
        return element.getAttribute("value");
    }

}


// INCERCARI


//    public static void moveSlider() {
//
//        WebElement element = driver().findElement(slider);
//
//        Actions moveSlider = new Actions(driver());
//        Action action = moveSlider.dragAndDropBy(element, -50, 5).build();
//
//        action.perform();
//    }
//
//        // Pt a gasi coordonatele x si Y ale butonului de pe slider :
//
//        public static void methodForSlidding() {
//
//            WebElement elementtwo = driver().findElement(slider);
//            Point pointButton = elementtwo.getLocation();
//            System.out.println("Slider button's position from left side is: " + pointButton.getX() + " pixels");
//            System.out.println("Slider button's position from right side is: " + pointButton.getY() + " pixels ");
//
//        }
//
//
//


//    public static void clickSliderButton() {
//
//        WebElement element = driver().findElement(sliderButton);
////        element.click();
//
//        Actions actions = new Actions(driver());
////        WebElement dragAction = driver().findElement(drag);
////        WebElement dropAction = driver().findElement(drop);
//
//        actions.moveByOffset(40,0).perform();
//
//    }


//    public static void moveSliderButton() {
//
//        WebElement element = driver().findElement(sliderButton);
//
//        for(int i = 1; i <= 40; i ++) {
//
//            element.sendKeys(Keys.ARROW_RIGHT);
//
//        }
//
//
//
//    }


// metoda pentru a da click pe buton si a-l misca spre dreapta, pana valoarea ajunge la 40

// Pt a gasi coordonatele x si Y ale butonului de pe slider :

//    public static void findInitialCoordinatesForSliderButton() {
//
//        WebElement element = driver().findElement(sliderButton);
//        Point pointButton = element.getLocation();
//        System.out.println("Slider button's position from left side is: " + pointButton.getX() + " pixels" );
//        System.out.println("Slider button's position from right side is: " + pointButton.getY() + " pixels ");
//
//    }
//
//    public static void moveSlideButton() {


//    }


//    public static void moveButton() {
//
//        WebElement element = driver().findElement(sliderField);
//
//        if(element.getAttribute("value").contains("25")) {
//
//            Actions actionSlider = new Actions(driver());
//            actionSlider.dragAndDrop(sliderButton,40);
//            actionSlider.clickAndHold(element);
//            actionSlider.moveByOffset(100,0);
//            actionSlider.release().perform();


//        WebElement element = driver().findElement(sliderButton);






