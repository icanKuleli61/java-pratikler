package app;

public class Helper {

    public static boolean isValidEmailPassword(UserData data,String email, String password) {
        if (email.isEmpty() || password.isEmpty()) {
            return false;
        }
        for (User user : data.getUsers()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
