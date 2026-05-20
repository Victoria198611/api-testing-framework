package api.services;
import io.qameta.allure.Step;
import utils.ConfigReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class BaseService {
    @Step("Initialize API request with base URL and headers")
    protected RequestSpecification request(){
        return RestAssured
                .given()
                .baseUri(ConfigReader.getProperty("base.url"))
                .header("Content-Type", "application/json")
                .header("x-api-key", ConfigReader.getProperty("api.key"))
                .log().all();
    }
}
