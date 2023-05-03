package testsPractice;

import model.Application;
import model.ApplicationHerokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cerinta3 {
    // test
    //cerinta_3
    //Step 1: Click pe Elements de pe pagina principala
    //Step 2: Click pe Web Tables din lista
    //Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
    //Step 4: Sa se stearga al 3lea rand din tabel
    //Step 5: Adauga o noua linie in tabel cu orice valori

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By webTables = By.xpath("//*[@id=\"item-3\"]/span[@class='text' and contains (text(), \"Web Tables\")]");
    private static By editButtonSecondRow = By.xpath("//div[@class='action-buttons']/span[@id='edit-record-2']");
    private static By firstName = By.id("firstName");
    private static By lastName = By.id("lastName");
    private static By email = By.id("userEmail");
    private static By age = By.id("age");
    private static By salary = By.id("salary");
    private static By department = By.id("department");
    private static By submitButton = By.id("submit");
    private static By deleteButtonThirdRow = By.xpath("//div[@class='action-buttons']/span[@id='delete-record-3']");
    private static By addButton = By.id("addNewRecordButton");


 @Test
    public void testCerinta3(){

     Application.start();

    //Step 1: Click pe Elements de pe pagina principala
     JavascriptExecutor js = (JavascriptExecutor) Application.driver();
     WebElement Element = Application.driver().findElement(elementsMenu);
     js.executeScript("arguments[0].scrollIntoView();", Element);
     Application.driver().findElement(elementsMenu).click();

     //Step 2: Click pe Web Tables din lista
     Application.driver().findElement(webTables).click();

     //Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
     Application.driver().findElement(editButtonSecondRow).click();

     WebElement elementFirstName = Application.driver().findElement(firstName);
     elementFirstName.clear();
     elementFirstName.sendKeys("Ion");

     WebElement elementLastName = Application.driver().findElement(lastName);
     elementLastName.clear();
     elementLastName.sendKeys("Pop");

     WebElement elementEmail = Application.driver().findElement(email);
     elementEmail.clear();
     elementEmail.sendKeys("test@automation.com");

     WebElement elementAge = Application.driver().findElement(age);
     elementAge.clear();
     elementAge.sendKeys("40");

     WebElement elementSalary = Application.driver().findElement(salary);
     elementSalary.clear();
     elementSalary.sendKeys("15000");

     WebElement elementDepartment = Application.driver().findElement(department);
     elementDepartment.clear();
     elementDepartment.sendKeys("Legal");

     Application.driver().findElement(submitButton).click();

     //Step 4: Sa se stearga al 3lea rand din tab
     Application.driver().findElement(deleteButtonThirdRow).click();

     //Step 5: Adauga o noua linie in tabel cu orice valori
     Application.driver().findElement(addButton).click();
     Application.driver().findElement(firstName).sendKeys("Marian");
     Application.driver().findElement(lastName).sendKeys("Lascu");
     Application.driver().findElement(email).sendKeys("marian.lascu@gmail.com");
     Application.driver().findElement(age).sendKeys("35");
     Application.driver().findElement(salary).sendKeys("18000");
     Application.driver().findElement(department).sendKeys("Software Engineering");
     Application.driver().findElement(submitButton).click();


     //ApplicationHerokuapp.close();
     Application.close();
 }
}
