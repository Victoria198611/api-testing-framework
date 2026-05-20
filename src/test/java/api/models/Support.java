package api.models;

//Represents the "support" section returned by the ReqRes API.
public class Support {
    private String url;
    private String text;

    //Returns the support URL provided by the API
    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }
}