package utils;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelperMethods {

    public static RequestSpecification getRequestSpec(String base_url) {
        RequestSpecBuilder requestSpec = new RequestSpecBuilder();
        return requestSpec.setBaseUri(base_url).
                addHeader("Content-Type", "application/json").
                addHeader("acccept", "").
                setContentType(ContentType.JSON).
                build();
    }

    public static Response performPost(RequestSpecification spec, Object requestBody, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .body(requestBody)
                .when()
                .post(endpoint);
    }

    public static Response performPut(RequestSpecification spec, Object requestBody, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .body(requestBody)
                .when()
                .put(endpoint);
    }

    public static Response performGet(RequestSpecification spec, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .when()
                .get(endpoint);
    }

    public static Response performGet(RequestSpecification spec, String key, String value, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .queryParam(key, value)
                .when()
                .get(endpoint);
    }

    public static JSONObject getJsonObject(String filePath) {
        JSONObject jsonObject = null;
        JSONParser parser = new JSONParser();
        try {
            jsonObject = (JSONObject) parser.parse(new FileReader(filePath));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
