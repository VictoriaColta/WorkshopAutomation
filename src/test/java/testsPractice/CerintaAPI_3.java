package testsPractice;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import routes.PetStoreRoutes;
import utils.DataLoader;
import utils.HelperMethods;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class CerintaAPI_3 {
    /**
     * Cerinta API_3: Afisati in consola numarul animalelor ce au status predominant:
     * Exemplu 1:
     * PET 1 - Available, PET 2 - Available, PET 3 - Available, PET 4 - Available
     * PET 5 - Sold
     * PET 6 - Pending, PET 7 - Pending
     * Raspuns corect: Available, nr of pets => 4
     * Exemplu 2:
     * PET 1 - Available, PET 2 - Available, PET 3 - Available, PET 4 - Available
     * PET 5 - Sold
     * PET 6 - Pending, PET 7 - Pending, PET 8 - Pending, PET 9 - Pending, PET 10 - Pending, PET 11 - Pending
     * Raspuns corect: Pending, nr of pets => 6
     */
    private static Response response;
    private static RequestSpecification spec;
    private static final String base_url = DataLoader.getInstance().getbaseUrl();
    private static String endpoint;

    @Test
    public void numberOfPredominantAnimals() {
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.FIND_BY_STATUS.getUrl();
        JsonPath path;
        List<Object> jsonArray;

        //perform get with available status
        response = HelperMethods.performGet(spec, "status", "available", endpoint);
        //response.prettyPrint();
        path = response.jsonPath();
        jsonArray = path.getList("");
        out.println("the list: " + jsonArray);
        int arraySizeAvailable = jsonArray.size();
        out.println("number of animals: " + arraySizeAvailable);

        //perform get with pending status
        response = HelperMethods.performGet(spec, "status", "pending", endpoint);
        // response.prettyPrint();
        path = response.jsonPath();
        jsonArray = path.getList("");
        out.println("the list: " + jsonArray);
        int arraySizePending = jsonArray.size();
        out.println("number of animals:" + arraySizePending);

        //perform get with sold status
        response = HelperMethods.performGet(spec, "status", "sold", endpoint);
        //    response.prettyPrint();
        path = response.jsonPath();
        jsonArray = path.getList("");
        out.println("the list: " + jsonArray);
        int arraySizeSold = jsonArray.size();
        out.println("number of animals: " + arraySizeSold);

        Map<String, Integer> animalStatus = new HashMap<>();
        animalStatus.put("available", arraySizeAvailable);
        animalStatus.put("pending", arraySizePending);
        animalStatus.put("sold", arraySizeSold);
        int maxAnimalsNumber;
        maxAnimalsNumber = Collections.max(animalStatus.entrySet(), Map.Entry.comparingByValue()).getValue();
        out.println("nr of animal with predominant status: " + maxAnimalsNumber);
        String predominantStatus;
        predominantStatus = Collections.max(animalStatus.entrySet(), Map.Entry.comparingByValue()).getKey();
        out.println("predominant status: " + predominantStatus);
    }
}
