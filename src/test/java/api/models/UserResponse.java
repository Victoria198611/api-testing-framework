package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Represents the response returned by the API after creating a user.
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {
    private String name;
    private String job;
    private String id;
  private String createdAt;
  private String updatedAt;

  //Returns the name sent in the request.
    public String getName() {
        return name;
    }

    //Returns the job sent in the request.
    public String getJob() {
        return job;
    }

    //Returns the auto-generated user ID returned by the API.
    public String getId() {
        return id;
    }

    //Returns the timestamp when the user was created.
    public String getcreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt(){
        return updatedAt;
    }
}
