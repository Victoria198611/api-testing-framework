package api.services;

import api.models.UserRequest;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class UserService extends BaseService {

    @Step("Get user by ID: {id}")
    public Response getUser(int id) {
        return request()
                .when()
                .get("/api/users/" + id)
                .then()
                .log().all()
                .extract().response();
    }
    @Step("Create user with name: {userRequest.name} and job: {userRequest.job}")
    public Response createUser(UserRequest userRequest) {
        return request()
                .body(userRequest)
                .when()
                .post("/api/users")
                .then()
                .log().all()
                .extract().response();
    }
    @Step("Update user with ID: {id}")
public Response updateUser(int id, UserRequest userRequest){
        return request()
                .body(userRequest)
                .when()
                .put("/api/users/" +id)
                .then()
                .log().all()
                .extract().response();
}
    @Step("Delete user with ID: {id}")
public Response deleteUser(int id) {
    return request()
            .when()
            .delete("/api/users/" + id)
            .then()
            .log().all()
            .extract().response();
}
}