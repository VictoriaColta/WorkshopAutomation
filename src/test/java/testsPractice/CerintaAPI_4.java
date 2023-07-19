package testsPractice;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import routes.PetStoreRoutes;
import utils.DataLoader;
import utils.HelperMethods;

public class CerintaAPI_4 {
    private static Response response;
    private static RequestSpecification spec;
    private static String base_url = DataLoader.getInstance().getbaseUrl();
    private static String api_key = DataLoader.getInstance().getApiKey();
    private static String endpoint;
    private static JSONObject jsonObject;

    // Cerinta API_4: Adauga un pet nou, sterge acel pet, si verifica ca nu se mai gaseste dupa id
    @Test
    public void addDeletePet() {
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.PET.getUrl();

        //ADD NEW PET
        jsonObject = HelperMethods.getJsonObject("jsons/addNewAnimal.json");
        int idToAdd=134;
        jsonObject.put("id", idToAdd);
        jsonObject.put("name", "Buddy");
        jsonObject.put("status", "available");
        String expectedName = jsonObject.get("name").toString();
        System.out.println("Name value from my json file: " + expectedName);
        response = HelperMethods.performPost(spec, jsonObject.toJSONString(), endpoint);
        response.getBody().prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("name"), expectedName);

        //DELETE THAT PET
        spec = HelperMethods.getRequestSpec(base_url, api_key);
        endpoint=PetStoreRoutes.PET_ID.getUrl();
        response = HelperMethods.performDeleteWithPathParams(spec,"petId", idToAdd ,endpoint);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);

        //PERFORM GET BY ID TO VERIFY THAT ID IS NO LONGER FOUND
        spec = HelperMethods.getRequestSpec(base_url);
        response=HelperMethods.performGetWithPathParams(spec,"petId",idToAdd,endpoint);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(), 404);
        Assert.assertEquals(response.jsonPath().getString("message"), "Pet not found");

    }
}
