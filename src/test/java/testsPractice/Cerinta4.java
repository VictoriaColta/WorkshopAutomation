package testsPractice;

import Utils.Drivers;
import elements.Elements;
import elements.UploadAndDownload;
import org.testng.Assert;
import org.testng.annotations.Test;

//    cerinta_4
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Upload and Download din lista
//    Step 3: Sa se faca un upload cu un fisier de tip .zip

public class Cerinta4 {

    @Test
    public void testCerinta4() {
        Drivers.startDriver();
        Elements.openElementsPage();
        UploadAndDownload.openUploadAndDownload();
        Assert.assertTrue(UploadAndDownload.isFileLoaded());

    }


}
