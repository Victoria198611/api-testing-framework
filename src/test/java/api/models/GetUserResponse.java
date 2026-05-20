package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Represents the response structure for GET /api/users/{id}.
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserResponse {
    private UserData data;
    private Support support;

//Returns the user data object
    public UserData getData(){
        return data;
    }
    public Support getSupport(){
        return support;
    }
    }