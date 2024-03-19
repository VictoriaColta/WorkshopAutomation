package testsPractice.APIs;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.openqa.selenium.remote.Response;

public class Cerinta_API_1 {
    ValidatableResponse validatableResponse;
    private static Response response;

    private static String body = "{\n" +
            "  \"id\": 0,\n" +
            "  \"category\": {\n" +
            "    \"id\": 0,\n" +
            "    \"name\": \"doggie\"\n" +
            "  },\n" +
            "  \"name\": \"doggie\",\n" +
            "  \"photoUrls\": [\n" +
            "    \"string\"\n" +
            "  ],\n" +
            "  \"tags\": [\n" +
            "    {\n" +
            "      \"id\": 0,\n" +
            "      \"name\": \"string\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \"available\"\n" +
            "}";


    @Test
    public void postPet() {
     RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        RestAssured.given()
             .contentType("application/json")
             .body(body).post().then()
             .log()
             .all()
             .assertThat()
             .statusCode(200);

//        Assertions.assertEquals( validatableResponse.extract().jsonPath().getString("name"), "doggie" );
    }
}
