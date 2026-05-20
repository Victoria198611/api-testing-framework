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
        Assert.assertEquals(user.getData().getEmail(),"janet.weaver@reqres.in");
        Assert.assertEquals(user.getData().getFirst_name(), "Janet");
        Assert.assertEquals(user.getData().getLast_name(), "Weaver");
        Assert.assertNotNull(user.getData().getAvatar());

        Assert.assertNotNull(user.getSupport().getUrl());
        Assert.assertNotNull(user.getSupport().getText());
    }
}
