package testsPractice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojoPayload.Category;
import pojoPayload.PetInfo;
import pojoPayload.Tag;
import routes.PetStoreRoutes;
import utils.DataLoader;
import utils.HelperMethods;

import java.util.ArrayList;
import java.util.List;

public class CerintaAPI_1 {
    /**
     * Cerinta API_1: Creaza un request de tip POST pentru a adauga un nou animal de companie in magazin (endpoint /pet)
     * - request-ul sa fie creeat la alegere cu json files/pojo/string
     * - sa se verifice status code la request (folositi Assert)
     * - sa se verifice numele ("name") ca este la fel cu cel din request
     */

    private static Response response;
    private static RequestSpecification spec;
    private static String base_url = DataLoader.getInstance().getbaseUrl();

    private static String endpoint;

    @Test
    public void addNewPetWithPojo() throws JsonProcessingException {
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.PET.getUrl();
        PetInfo petInfo = new PetInfo();
        petInfo.setId(1);
        petInfo.setCategory(new Category(10, "dog"));
        petInfo.setName("FOXY");
        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        petInfo.setPhotoUrls(photoUrls);
        List<Tag> listOfTags = new ArrayList<>();
        listOfTags.add(new Tag(10, "name"));
        petInfo.setTags(listOfTags);
        petInfo.setStatus("available");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(petInfo);
        System.out.println("Json string: " + json);
        JSONObject jsonObject = new JSONObject(json);
        System.out.println("Json object: " + jsonObject);
        System.out.println("Response with serialization");
        response = HelperMethods.performPost(spec, jsonObject.toString(), endpoint);
//        System.out.println("Response with serialization done by RestAssured");
//        response = HelperMethods.sendPostRequest(spec, petInfo, route);
        response.getBody().prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);
        String expectedName = petInfo.getName().toString();
        System.out.println(expectedName);
        Assert.assertEquals(response.jsonPath().getString("name"), expectedName);

    }

    @Test
    public void addNewPetWithJsonFile() {
        spec = HelperMethods.getRequestSpec(base_url);
        endpoint = PetStoreRoutes.PET.getUrl();
        String requestBody = HelperMethods.getJsonObject("jsons/addNewAnimal.json").toJSONString();
        response = HelperMethods.performPost(spec, requestBody, endpoint);
        response.getBody().prettyPrint();
        Assert.assertEquals(response.statusCode(), 200);
        String expectedName = HelperMethods.getJsonObject("jsons/addNewAnimal.json").get("name").toString();
        System.out.println("Name value from my json file: " + expectedName);
        Assert.assertEquals(response.jsonPath().getString("name"), expectedName);
    }
}
