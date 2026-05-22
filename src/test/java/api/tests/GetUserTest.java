package api.tests;

import api.models.GetUserResponse;
import api.models.UserRequest;
import api.models.UserResponse;
import api.services.UserService;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest extends TestBase {
    UserService userService = new UserService();


    @Test
    @Description("Creates a user and checks that the API returns the correct data.")
    public void testCreateUserWithPOJO() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        UserRequest request = new UserRequest("Victoria", "QA Engineer");
        Response response = userService.createUser(request);
        UserResponse userResponse = response.as(UserResponse.class);

        Assert.assertEquals(response.statusCode(), 201);
        Assert.assertEquals(userResponse.getName(), "Victoria");
        Assert.assertEquals(userResponse.getJob(), "QA Engineer");
        Assert.assertNotNull(userResponse.getId());
        Assert.assertNotNull(userResponse.getcreatedAt());
    }

    @Test
    @Description("Retrieves a user by ID using a POJO response model and validates all returned fields.")
    public void testGetUserWithPOJO() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        Response response = userService.getUser(2);
        GetUserResponse user = response.as(GetUserResponse.class);

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(user.getData().getId(), 2);
        Assert.assertEquals(user.getData().getEmail(), "janet.weaver@reqres.in");
        Assert.assertEquals(user.getData().getFirst_name(), "Janet");
        Assert.assertEquals(user.getData().getLast_name(), "Weaver");
        Assert.assertNotNull(user.getData().getAvatar());

        Assert.assertNotNull(user.getSupport().getUrl());
        Assert.assertNotNull(user.getSupport().getText());
    }

    @Test
    @Description("Updates an existing user and validates that the API returns the updated fields and timestamp.")
    public void testUpdateUserTestWithPOJO() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        UserRequest request = new UserRequest("Victoria", "QA Tester");
        Response response = userService.updateUser(2, request);
        UserResponse userResponse = response.as(UserResponse.class);

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(userResponse.getName(), "Victoria");
        Assert.assertEquals(userResponse.getJob(), "QA Tester");
        Assert.assertNotNull(userResponse.getUpdatedAt());
    }

    @Test
    @Description("Deletes an existing user by ID and verifies that the API returns status code 204 (No Content).")
    public void testDeleteUser() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        Response response = userService.deleteUser(2);
        Assert.assertEquals(response.statusCode(), 204);
    }

    @Test
    @Description("Attempts to retrieve a non‑existent user and verifies that the API returns 404 Not Found.")
public void testUserNotFound() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        Response response = userService.getUser(999);
        Assert.assertEquals(response.statusCode(), 404);
    }

@Test
@Description("Attempts to delete a non‑existent user and verifies that the API still returns 204 No Content, as ReqRes does not validate missing resources.")
public void testDeleteUserNotFound(){
    RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    Response response=userService.deleteUser(999);
    Assert.assertEquals(response.statusCode(),204);
}

@Test
@Description("Sends an invalid user creation request with empty fields and verifies that the API still returns 201 Created, since ReqRes does not validate input.")
public void testCreateUserBadRequest(){
    RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    UserRequest request=new UserRequest("", "");
    Response response=userService.createUser(request);
  Assert.assertEquals(response.statusCode(),201);
}

@Test
@Description("Attempts to update a user with invalid data (empty fields) and verifies that the API returns 200 OK, as ReqRes accepts any payload.")
public void testUpdateUserBadRequest(){
    RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    UserRequest request=new UserRequest("", "");
    Response response=userService.updateUser(2, request);

    Assert.assertEquals(response.statusCode(),200);
}
}
