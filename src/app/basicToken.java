package app;

public class basicToken implements AuthStrategy {


    @Override
    public boolean authenticate(UserData data, String email, String password) {
        return false;
    }

    @Override
    public String login(UserData data, String email, String password) {
        return "JWT_"+email;
    }
}
