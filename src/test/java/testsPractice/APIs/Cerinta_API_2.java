package testsPractice.APIs;

import io.restassured.RestAssured;
import org.junit.Test;

public class Cerinta_API_2 {

    private static org.openqa.selenium.remote.Response response;
    String animalId = "9223372036854248389";
   private static String requestBody = "{\n" +
            "  \"status\": \"sold\" }";

    @Test
    public void putRequest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
      RestAssured.given()
             .contentType("application/json")
             .body(requestBody).put().then()
             .log()
             .all()
             .assertThat()
             .statusCode(200);
    }
}
