package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;


public class Cerinta3 {
        /*Folosind model/Application.java, sa se deschida aplicatia https://demoqa.com/
            cerinta_3
                Step 1: Click pe Elements de pe pagina principala
                Step 2: Click pe Web Tables din lista
                Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
                Step 4: Sa se stearga al 3lea rand din tabel
                Step 5: Adauga o noua linie in tabel cu orice valori
    */

    private void sendKeys(WebDriver driver, By locator, String input){
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(input);
    }

    @Test
    public void testCerinta3() {
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/");

        //Step 1: Click pe Elements de pe pagina principala
        WebElement btnElements = driver.findElement(By.xpath("//*[@class=\"card mt-4 top-card\"][1]"));
        btnElements.click();

        //Step 2: Click pe Web Tables din lista
        WebElement btnWebTables = driver.findElement(By.xpath("//*[@id=\"item-3\"]"));
        btnWebTables.click();

        //Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
        List<WebElement> btnEdit = driver.findElements(By.xpath("//*[@title=\"Edit\"]"));
        btnEdit.get(1).click();

        By firstNameLocation = By.xpath(".//input[@id='firstName']");
        By lastNameLocation = By.xpath(".//input[@id='lastName']");
        By emailLocation = By.xpath(".//input[@id='userEmail']");
        By ageLocation = By.xpath(".//input[@id='age']");
        By salaryLocation = By.xpath(".//input[@id='salary']");
        By departmentLocation = By.xpath(".//input[@id='department']");

        sendKeys(driver, firstNameLocation, "Ion" );
        sendKeys(driver, lastNameLocation, "Pop" );
        sendKeys(driver, emailLocation, "test@automation.com" );
        sendKeys(driver, ageLocation, "40" );
        sendKeys(driver, salaryLocation, "15000" );
        sendKeys(driver, departmentLocation, "Legal" );

        WebElement btnSubmit = driver.findElement(By.xpath(".//*[@id='submit']"));
        btnSubmit.click();

        //Step 4: Sa se stearga al 3lea rand din tabel
        List<WebElement> btnDeleteRows = driver.findElements(By.xpath("//*[@title=\"Delete\"]"));
        btnDeleteRows.get(2).click();

        //Step 5: Adauga o noua linie in tabel cu orice valori
        WebElement btnAddRow = driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]"));
        btnAddRow.click();

        sendKeys(driver, firstNameLocation, "Mihai" );
        sendKeys(driver, lastNameLocation, "Talent" );
        sendKeys(driver, emailLocation, "mihaita@talent.com" );
        sendKeys(driver, ageLocation, "18" );
        sendKeys(driver, salaryLocation, "150000" );
        sendKeys(driver, departmentLocation, "Human Resources" );
        driver.findElement(By.xpath(".//*[@id='submit']")).click();

        List<WebElement> tableCells = driver.findElements(By.xpath(".//*[@role='gridcell']"));

        String tableCellsText = "";
        for (WebElement selectedElement : tableCells) {
            tableCellsText += selectedElement.getText() + " ";
        }
        tableCellsText = tableCellsText.trim();

        String expectedTableValues = "Cierra Vega 39 cierra@example.com 10000 Insurance  Ion Pop 40 test@automation.com 15000 Legal  Mihai Talent 18 mihaita@talent.com 150000 Human Resources";
        Assert.assertEquals(tableCellsText, expectedTableValues);
    }
}
