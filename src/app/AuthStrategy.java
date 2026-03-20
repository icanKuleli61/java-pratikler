package app;

public interface AuthStrategy {

    boolean authenticate(UserData data, String email, String password);

    String login(UserData data, String email, String password);
}
