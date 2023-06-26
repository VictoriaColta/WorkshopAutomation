package testsPractice;

import backend_practice.Category;
import backend_practice.ModelForPOJO;
import backend_practice.Tag;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RestAssuredHandlers {
    @Test
    public void handleRequestWithStrings() {
        RestAssured.baseURI = "https://petstore.swagger.io";
        String request = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 32,\n" +
                "    \"name\": \"cute\"\n" +
                "  },\n" +
                "  \"name\": \"Capibara\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"Jimmy The Handsome\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        Response response = given()
                .queryParam("status", "sold")
                .headers("Content-Type", "application/json")
                .body(request)
                .post("/v2/pet")
                .then()
                .extract()
                .response();

        response.getBody().prettyPrint();
    }

    @Test
    public void handleRequestWithPOJO() throws JsonProcessingException {
        RestAssured.baseURI = "https://petstore.swagger.io";
        ModelForPOJO modelForPOJO = new ModelForPOJO();

        modelForPOJO.setId("0");
        modelForPOJO.setCategory(new Category(0, "cute"));
        modelForPOJO.setName("Capibara");
        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        modelForPOJO.setPhotoUrls(photoUrls);
        List<Tag> listOfTags = new ArrayList<>();
        listOfTags.add(new Tag(10, "Jimmy the handsome"));
        modelForPOJO.setTags(listOfTags);
        modelForPOJO.setStatus("available");
        // modelforpojo class is ready
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(modelForPOJO);
        System.out.println(json);
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject.toString(5));
        Response response = given()
                .queryParam("status", "sold")
                .headers("Content-Type", "application/json")
                .body(jsonObject.toString())
                .post("/v2/pet")
                .then()
                .extract()
                .response();

        response.getBody().prettyPrint();
    }

    @Test
    public void handleRequestWithJSONFiles() throws IOException, ParseException {
        RestAssured.baseURI = "https://petstore.swagger.io";
        JSONParser jsonParser = new JSONParser();
        String json = jsonParser.parse(
                new FileReader("jsons/postRequestJSON.json")).toString();
        JSONObject data = new JSONObject(json);
        System.out.println(data.toString(5));
        data.put("name", "lion");
        data.put("olaola_mariola", "test");
        System.out.println(data.toString(5));

        Response response = given()
                .queryParam("status", "sold")
                .headers("Content-Type", "application/json")
                .body(data.toString())
                .post("/v2/pet")
                .then()
                .extract()
                .response();
        response.getBody().prettyPrint();
        System.out.println(response.jsonPath().getString("name"));
        System.out.println(response.jsonPath().getString("tags[0].name"));
    }

}
