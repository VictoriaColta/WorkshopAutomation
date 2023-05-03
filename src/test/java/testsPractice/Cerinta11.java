package testsPractice;

import home.HomePage;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;
import widgets.Slider;
import widgets.Widgets;

import java.util.Arrays;
import java.util.List;

public class Cerinta11 {
    @Test
    public void cerinta11() throws InterruptedException {
        Application.start();

//        Step 1: Click pe Widgets de pe pagina principala
        HomePage.clickWidgets();

//        Step 2: Click pe "Slider" din lista
        Widgets.clickSlider();
//        Step 3: Muta slider-ul la 40, asteapta 3 secunde (puteti folosi thread.sleep) - Important pentru demo
//        Step 4: Verifica valoare de input ca este egal cu 40
//        Step 5: Repeta pasul 3 si 4 pentru valorile, 80, 30, 20, 99, 5, 15, 10
        Slider.setAndCheckSlider(40);
        Slider.setAndCheckSlider(80);
        Slider.setAndCheckSlider(30);
        Slider.setAndCheckSlider(20);
        Slider.setAndCheckSlider(99);
        Slider.setAndCheckSlider(5);
        Slider.setAndCheckSlider(15);
        Slider.setAndCheckSlider(10);

        Application.close();
    }
}
