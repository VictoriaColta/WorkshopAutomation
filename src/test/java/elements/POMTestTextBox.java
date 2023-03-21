package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static model.ApplicationNumberTwo.driver;

//Scrierea unui test aplicand design pattern-ul POM pentru pagina Elements->TextBox de pe https://demoqa.com



public class POMTestTextBox {
    @Test
    public void testPOM() throws InterruptedException {
        ApplicationNumberTwo.start();
        HomePage.clickElements();
        Elements.clickTextBox();
        TextBox.setFullName("James Bond");
        TextBox.setEmail("JamesBond007@yahoo.com");
        TextBox.setCurrentAddress("Strada Veseliei, Numarul 1, Scara Blocului, Apartament 3, Etaj 10");
        TextBox.setPermanentAddress("Strada Lalelelor, Numarul 25, Scara A, Apartament 45, Etaj 5");

        // Pt ca nu imi gasea elemenetul in pagina ( butonul submit) am incercat modalitati de a-l face vizibil.
        //Prima incercare: (nu a mers)
//        WebDriverWait wait = new WebDriverWait(driver(),10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));


        WebElement element = driver().findElement(By.id("submit"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver(); //JavascriptExecutor este o clasa, jsExecutor e un obiect al clasei
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        TextBox.clickSubmitButton();

        WebElement firstField = driver().findElement(By.xpath("((//p[@class='mb-1']))[1]"));
        String expectedTextForFirstField = "Name:James Bond";
        Assert.assertEquals(expectedTextForFirstField,firstField.getText());
        System.out.println("James Bond is expected-Assert passed.");

        WebElement secondField = driver().findElement(By.xpath("//p[@id='email']"));
        String expectedTextForSecondField = "Email:JamesBond007@yahoo.com";
        Assert.assertEquals(expectedTextForSecondField,secondField.getText());
        System.out.println("JamesBond007@yahoo.com is expected-Assert passed");

        WebElement thirdField = driver().findElement(By.xpath("//p[@id='currentAddress']"));
        String expectedTextForThirdField = "Current Address :Strada Veseliei, Numarul 1, Scara Blocului, Apartament 3, Etaj 10";
        Assert.assertEquals(expectedTextForThirdField,thirdField.getText());
        System.out.println("Strada Veseliei, Numarul 1, Scara Blocului, Apartament 3, Etaj 10 is expected-Assert passed");

        WebElement fourthField = driver().findElement(By.xpath("//p[@id='permanentAddress']"));
        String expectedTextForFouthField = "Permananet Address :Strada Lalelelor, Numarul 25, Scara A, Apartament 45, Etaj 5";
        Assert.assertEquals(expectedTextForFouthField,fourthField.getText());
        System.out.println("Strada Lalelelor, Numarul 25, Scara A, Apartament 45, Etaj 5 is expected-Assert passed");

        ApplicationNumberTwo.close();
    }
}

// la linia 38: am facut casting de la WebDriver ( driver() ) la JavaScript executor pentru a putea apela metoda "executeScript" de la linia 39
// "argument[0]"  va fi inlocuit cu "element". Pe element se va apela metoda "scrollIntoView(true)"
// liniile 38-39 - nu se vede butonul "submit" daca nu se face scroll pe pagina. astfel pica testul



