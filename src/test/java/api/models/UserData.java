package api.models;

//Represents the "data" section returned by the ReqRes API for a single user.
public class UserData {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    //Returns the user's unique ID.
    public int getId(){
        return id;
    }
    //Returns the user's email address.
    public String getEmail(){
        return email;
    }
    //Returns the user's first name.
    public String getFirst_name(){
        return first_name;
    }
//Returns the user's last name.
    public String getLast_name(){
        return last_name;
    }

    //Returns the URL of the user's avatar image.
    public String getAvatar() {
        return avatar;
    }
    }