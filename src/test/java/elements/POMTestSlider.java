package elements;
import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.*;
//
//cerinta_11:
//        Step 1: Click pe Widgets de pe pagina principala
//        Step 2: Click pe "Slider" din lista
//        Step 3: Muta slider-ul la 40, asteapta 3 secunde (puteti folosi thread.sleep) - Important pentru demo
//        Step 4: Verifica valoare de input ca este egal cu 40
//        Step 5: Repeta pasul 3 si 4 pentru valorile, 80, 30, 20, 99, 5, 15, 10


public class POMTestSlider {

    @BeforeSuite

    public static void printBeforeSuiteText() {

        System.out.println("This is before suite text for POMTestSlider");

    }

    @Test

    public static void testPOMSlider() throws InterruptedException {

        ApplicationNumberTwo.start();
        HomePage.clickWidgets();
        Widgets.clickSlider();
        Slider.moveSlider(8);
        Assert.assertEquals(Slider.verifySliderValue(), "8");
        Slider.moveSlider(40);
        Assert.assertEquals(Slider.verifySliderValue(), "40");
        Slider.moveSlider(80);
        Assert.assertEquals(Slider.verifySliderValue(), "80");
        Slider.moveSlider(30);
        Assert.assertEquals(Slider.verifySliderValue(), "30");
        Slider.moveSlider(20);
        Assert.assertEquals(Slider.verifySliderValue(), "20");
        Slider.moveSlider(99);
        Assert.assertEquals(Slider.verifySliderValue(), "99");
        Slider.moveSlider(5);
        Assert.assertEquals(Slider.verifySliderValue(), "5");
        Slider.moveSlider(15);
        Assert.assertEquals(Slider.verifySliderValue(), "15");
        Slider.moveSlider(10);
        Assert.assertEquals(Slider.verifySliderValue(), "10");
        ApplicationNumberTwo.close();
    }
    @AfterSuite

    public static void printAfterSuiteText() {

        System.out.println("This is after suite text for POMTestSlider");

    }
    @BeforeMethod
    public static void printBeforeMethodText() {

        System.out.println("This is before method text for POMTestSlider");

    }
    @AfterMethod

    public static void printAfterMethodText() {

        System.out.println("This is after method text for POMTestSlider");

    }
}
