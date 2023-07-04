package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class Cerinta2 {


    @Test
    public void testCerinta2(){
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        CheckBoxPage.click(CheckBoxPage.checkBoxSection);
        CheckBoxPage.click(CheckBoxPage.toggle);
        CheckBoxPage.click(CheckBoxPage.desktop);
        CheckBoxPage.getText();
        ApplicationDemoQa.close();
    }
}
