package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPropertiesPage;

public class Cerinta8 {
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
