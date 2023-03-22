package testsPractice;

import elements.Elements;
import elements.TextBox;
import home.HomePage;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractice {
    @Test
    public void testPOM() {
        Application.start();
        HomePage.clickElements();
        Elements.clickTextBox();
        TextBox.setFullName("Ion");
        TextBox.setEmail("asd@asd.asd");
        TextBox.setCurrentAddress("Mihai Viteazuu nr 2");
        TextBox.setPermanentAddress("Mihai Trasnet nr 3");
        TextBox.clickSubmit();
        Assert.assertTrue(TextBox.getResultText().contains( "Ion"));
    }
}
