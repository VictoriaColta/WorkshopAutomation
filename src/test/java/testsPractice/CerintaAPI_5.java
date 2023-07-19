package testsPractice;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import routes.PetStoreRoutes;
import utils.DataLoader;
import utils.HelperMethods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CerintaAPI_5 {
    /**
     * Cerinta API_5: Creeaza o comanda de a cumpara un pet in viitor cu 3 luni (endpoint /store/order)
     * IMPORTANT!!! Codul vostru trebuie sa mearga cu orice numar de luni in viitor ( *** NU DOAR 3 *** )
     * Verifica comanda cu GET ca a fost plasata cu succes ( returneaza status code ~200)
     * Sterge comanda
     * Verifica comanda cu GET ca nu mai exista
     */

    private static Response response;
    private static RequestSpecification spec;
    private static String base_url = DataLoader.getInstance().getbaseUrl();
    private static String endpoint;
    private static JSONObject jsonObject;

    @Test
    public void createOrderInFuture() throws FileNotFoundException {
        int monthsToAdd = 3;
        int orderId = 9;
        //GET CURRENT DATE AND TIME
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date time without formatting " + currentDateTime);
        //ADD THE SPECIFIED NUMBER OF MOTHS TO CURRENT DATE
        LocalDateTime futureDateTime = currentDateTime.plusMonths(monthsToAdd);
        System.out.println("Future date time without formatting " + futureDateTime);
        //Create DateTimeFormatter for ISO 8601 format with milliseconds and UTC offset
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        //Format future LocalDateTime object using the formatter
        String formattedFutureDateTime = futureDateTime.format(formatter);
        System.out.println(formattedFutureDateTime);

        //PLACE ORDER
        System.out.println("PLACE ORDER");
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.STORE_ORDER.getUrl();
        jsonObject = HelperMethods.getJsonObject("jsons/placePetOrder");
        jsonObject.put("id", orderId);
        jsonObject.put("petId", 13);
        jsonObject.put("shipDate", formattedFutureDateTime);
        response = HelperMethods.performPost(spec, jsonObject.toJSONString(), endpoint);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);

        //FIND PURCHASE ORDER BY ID
        System.out.println("FIND PURCHASE ORDER BY ID");
        endpoint = PetStoreRoutes.STORE_ORDER_ORDER_ID.getUrl();
        System.out.println(endpoint);
        response = HelperMethods.performGetWithPathParams(spec, "orderId",orderId, endpoint);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);

    }
}
