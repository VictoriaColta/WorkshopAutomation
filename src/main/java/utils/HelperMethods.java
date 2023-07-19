package utils;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class HelperMethods {
    public static RequestLoggingFilter getRequestFilters() {
        PrintStream log = null;
        try {
            log = new PrintStream(new FileOutputStream("request-logging.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestLoggingFilter requestLoggingFilter = new RequestLoggingFilter(log);
        return requestLoggingFilter;
    }
    public static ResponseLoggingFilter getResponseFilters() {
        PrintStream log = null;
        try {
            log = new PrintStream(new FileOutputStream("response-logging.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ResponseLoggingFilter responseLoggingFilter = new ResponseLoggingFilter(log);
        return responseLoggingFilter;
    }

    public static RequestSpecification getRequestSpec(String base_url) {
        RequestSpecBuilder requestSpec = new RequestSpecBuilder();
        return requestSpec.setBaseUri(base_url).
                addHeader("Content-Type", "application/json").
                setContentType(ContentType.JSON).
                build();
    }

    public static RequestSpecification getRequestSpec(String base_url, String apiKey) {
        RequestSpecBuilder requestSpec = new RequestSpecBuilder();
        return requestSpec.setBaseUri(base_url).
                addHeader("Content-Type", "application/json").
                addHeader("api_key", apiKey).
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

    public static Response performGetWithPathParams(RequestSpecification spec, String key, int value, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .filters(getRequestFilters(),getResponseFilters())
                .pathParam(key, value)
                .when()
                .get(endpoint);
    }

    public static Response performDelete(RequestSpecification spec, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .when()
                .delete(endpoint);
    }

    public static Response performDeleteWithPathParams(RequestSpecification spec,String key, int value, String endpoint) {
        return RestAssured
                .given()
                .spec(spec)
                .pathParam(key, value)
                .when()
                .delete(endpoint);
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
