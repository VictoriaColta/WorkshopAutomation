package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HelperMethods {
    private static Response request;


    public static Response performPost(RequestSpecification spec, Object requestBody, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .body(requestBody)
                .when()
                .post(endpoint);
    }

    public static Response performPUT(RequestSpecification spec, Object requestBody, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .body(requestBody)
                .when()
                .put(endpoint);
    }

}
