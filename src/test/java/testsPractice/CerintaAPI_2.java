package testsPractice;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import routes.PetStoreRoutes;
import utils.DataLoader;
import utils.HelperMethods;

public class CerintaAPI_2 {
    /**
     * Cerinta API_2: Schimbati statusul unui animal din magazin (endpoint /pet)
     * - assert status code
     * - verificati ca response-ul este corect
     * - Aditional, verificati statusul unui animal cu GET petId inainte si dupa update
     */
    private static Response response;
    private static RequestSpecification spec;
    private static String base_url = DataLoader.getInstance().getbaseUrl();
    private static String endpoint;

    @Test
    public void changeAnimalStatus() {
        spec = HelperMethods.getRequestSpec(base_url);
        JSONObject jsonObject;
        //aici trebuie updatat manual animalId
       int petId=123;
        //ADD PET
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.PET.getUrl();
        jsonObject = HelperMethods.getJsonObject("jsons/addNewAnimal.json");
        jsonObject.put("id", petId);
        response = HelperMethods.performPost(spec, jsonObject, endpoint);
        System.out.println("ADD NEW ANIMAL");
        response.prettyPrint();
        //GET
        endpoint = PetStoreRoutes.PET.getUrl() + "/"+petId;
        response = HelperMethods.performGet(spec, endpoint);
        System.out.println("GET ANIMAL BY ID");
        response.prettyPrint();
        Assert.assertEquals(response.jsonPath().getString("status"), "available");
        Assert.assertEquals(response.statusCode(), 200);
        //PUT
        jsonObject = HelperMethods.getJsonObject("jsons/addNewAnimal.json");
        jsonObject.put("id",petId);
        jsonObject.put("status", "pending");
        endpoint = PetStoreRoutes.PET.getUrl();
        response = HelperMethods.performPut(spec, jsonObject.toJSONString(), endpoint);
        System.out.println("UPDATE ANIMAL");
        response.getBody().prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);
        //GET AGAIN
        endpoint = PetStoreRoutes.PET_ID.getUrl();
        response = HelperMethods.performGetWithPathParams(spec,"pet",petId,endpoint);
        System.out.println("GET THE ANIMAL AGAIN");
        response.prettyPrint();
        Assert.assertEquals(response.jsonPath().getString("status"), "pending");
        Assert.assertEquals(response.statusCode(), 200);

    }
}
