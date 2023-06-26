package testsPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.testng.annotations.Test;

public class RestAssuredDemo {

    @Test
    public void firstRequest() {
        RestAssured.baseURI = "https://petstore.swagger.io";
        System.out.println(RestAssured
                .given()
                .queryParam("status", "sold")
                .headers("Content-Type", "application/json")
                .get("/v2/pet/findByStatus")
                .then()
                .extract()
                .response());
        Response response = RestAssured
                .given()
                .queryParam("status", "sold")
                .headers("Content-Type", "application/json")
                .get("/v2/pet/findByStatus")
                .then()
                .extract()
                .response();
        System.out.println("ID of the first animal => " + response.jsonPath().getString("[0].id"));
        System.out.println(response.jsonPath().getString("[1].tags[0].name"));
        System.out.println(response.jsonPath().getList(""));

        for (Object s : response.jsonPath().getList("")) {
            System.out.println(s);
        }
    }
}
