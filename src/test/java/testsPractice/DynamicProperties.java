package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPropertiesPage;

import java.time.Duration;

public class DynamicProperties {
    @Test
    public void cerinta8(){
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        DynamicPropertiesPage.click(DynamicPropertiesPage.dynamicProperties);
        Assert.assertTrue(DynamicPropertiesPage.isFiveSecondsButtonVisibleAfter(5));
        Assert.assertTrue(DynamicPropertiesPage.isColorChanged());
        ApplicationDemoQa.close();
    }
}
