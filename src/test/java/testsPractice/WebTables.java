package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.WebTablesPage;

public class WebTables {
    @Test
    public void testCerinta3() throws InterruptedException {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        WebTablesPage.click(WebTablesPage.webTablesSection);
        WebTablesPage.click(WebTablesPage.secondEditButton);
        WebTablesPage.enterValues(WebTablesPage.firstNameField,"Ion");
        WebTablesPage.enterValues(WebTablesPage.lastNameField,"Pop");
        WebTablesPage.enterValues(WebTablesPage.ageField,"40");
        WebTablesPage.enterValues(WebTablesPage.emailField,"test@automation.com");
        WebTablesPage.enterValues(WebTablesPage.salaryField,"1500");
        WebTablesPage.enterValues(WebTablesPage.departmentField,"Legal");
        WebTablesPage.click(WebTablesPage.submitButton);
        Thread.sleep(2000);
        WebTablesPage.click(WebTablesPage.deleteButton);
        WebTablesPage.click(WebTablesPage.addNewRecord);
        WebTablesPage.enterValues(WebTablesPage.firstNameField,"Madalina");
        WebTablesPage.enterValues(WebTablesPage.lastNameField,"Gherghel");
        WebTablesPage.enterValues(WebTablesPage.ageField,"28");
        WebTablesPage.enterValues(WebTablesPage.emailField,"mada@automation.com");
        WebTablesPage.enterValues(WebTablesPage.salaryField,"1500");
        WebTablesPage.enterValues(WebTablesPage.departmentField,"qa");
        WebTablesPage.click(WebTablesPage.submitButton);

        ApplicationDemoQa.close();

    }
}
