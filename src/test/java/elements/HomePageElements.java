package elements;

import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static model.SecondApplication.driver;
public class HomePageElements {
    private static By elementsSectionElement = By.xpath("//h5[normalize-space()='Elements']");
    private static By alertsFrameWindowsSectionElement = By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']");
    private static By widgetsButtonElement = By.xpath(" //h5[normalize-space()='Widgets']");


    public static void clickOnElementsSection() {

        WebElement elements = SecondApplication.driver().findElement(elementsSectionElement);
        elements.click();

    }

    public static void clickOnAlertsSection() {

        WebElement alertsFrameWindowsSection = driver().findElement(alertsFrameWindowsSectionElement);
        alertsFrameWindowsSection.click();

    }

    public static void clickWidgetsSection() {
        WebElement widgets = driver().findElement(widgetsButtonElement);
        widgets.click();
    }
}
