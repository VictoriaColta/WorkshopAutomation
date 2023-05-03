package widgets;

import model.Application;
import org.openqa.selenium.By;
import utils.Handler;

public class Widgets {
    private static final By datePickerButton = By.xpath("//span[text()='Date Picker']");

    private static final By accordianButton = By.xpath("//span[text()='Accordian']");

    private static final By sliderButton = By.xpath("//span[text()='Slider']");

    public static void clickDatePicker(){
        Handler.clickElement(datePickerButton);
    }

    public static void clickAccordian(){
        Handler.clickElement(accordianButton);
    }

    public static void clickSlider(){
        Handler.clickElement(sliderButton);
    }
}


