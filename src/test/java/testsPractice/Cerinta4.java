package testsPractice;

import elements.Checkbox;
import elements.Elements;
import elements.UploadDownload;
import model.Application;
import org.testng.annotations.Test;
import pages.Homepage;

public class Cerinta4 {

    @Test
    public void cerinta4 () {
        // Step 1: Click pe Elements de pe pagina principala
        Application.start();
        Homepage.scrollUntilElementIsVisible();
        Homepage.clickElementsMenu();

        // Step 2: Click pe Upload and Download din lista
        UploadDownload.clickUploadDownload();

        // Step 3: Sa se faca un upload cu un fisier de tip .zip
        UploadDownload.uploadFile();



     /*   // Step 4: Close browser
        Application.close();*/



    }


}
