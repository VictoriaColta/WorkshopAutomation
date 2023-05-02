package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBox {
    @Test
    public void testCerinta2(){
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        CheckBoxPage.clickCheckBoxSection();
        CheckBoxPage.clickToogle();
        CheckBoxPage.clickDesktopCheckBox();
        CheckBoxPage.getText();
        ApplicationDemoQa.close();
    }
}
