package Singleton;

public class Client {
    public static void main(String[] args) {
        Authentication authInstance1 = Authentication.getInstance();
        System.out.println(authInstance1.getMessage());
        authInstance1.setMessage("Instance 1 created me");

        Authentication authInstance2 = Authentication.getInstance();
        System.out.println(authInstance2.getMessage());
        authInstance2.setMessage("Instance 2 created me");

        System.out.println(authInstance1.getMessage());
    }
}
