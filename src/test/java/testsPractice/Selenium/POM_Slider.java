package testsPractice.Selenium;

import elements.HomePage;
import elements.Slider;
import elements.Widgets;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Slider {
//    cerinta_11:
//    Step 1: Click pe Widgets de pe pagina principala
//    Step 2: Click pe "Slider" din lista
//    Step 3: Muta slider-ul la 40, asteapta 3 secunde (puteti folosi thread.sleep) - Important pentru demo
//    Step 4: Verifica valoare de input ca este egal cu 40
//    Step 5: Repeta pasul 3 si 4 pentru valorile, 80, 30, 20, 99, 5, 15, 10

    @Test
    public void widgets_Slider() throws InterruptedException {
        SecondApplication.start();
        HomePage.clickWidgetsSection();
        Widgets.clickSlider();
        Slider.setAndCheckSlider(40);
        Slider.setAndCheckSlider(10);
        Slider.setAndCheckSlider(40);

        SecondApplication.close();
    }

}
