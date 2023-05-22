package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.SliderPage;

public class Cerinta11 {
    @Test
    public void cerinta11() throws InterruptedException {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.widgets);
        SliderPage.click(SliderPage.sliderSection);
        SliderPage.moveSlider(40);
        SliderPage.assertSliderHasValue(40);
        SliderPage.moveSlider(80);
        SliderPage.assertSliderHasValue(80);
        SliderPage.moveSlider(30);
        SliderPage.assertSliderHasValue(30);
        SliderPage.moveSlider(20);
        SliderPage.moveSlider(5);
        SliderPage.moveSlider(15);
        SliderPage.moveSlider(10);
    }
}
