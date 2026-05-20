package api.models;

public class UserRequest {
    private String name;
    private String job;

    // Model representing the request body for creating or updating a user.
    public UserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }
    // Getters, Setters, Constructor
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
