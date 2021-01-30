package Singleton;

public class Authentication {
    private static final Authentication INSTANCE = new Authentication();
    private Authentication() {}
    private String message;

    public  static Authentication getInstance() {
        return INSTANCE;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
