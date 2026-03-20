package app;


import java.util.Random;

public class JwtToken implements AuthStrategy {

    @Override
    public boolean authenticate(UserData data, String email, String password) {
        boolean validEmailPassword = Helper.isValidEmailPassword(data, email, password);
        return validEmailPassword;
    }

    @Override
    public String login(UserData data, String email, String password) {
        if (!authenticate(data, email, password)) {
            throw new RuntimeException("Kullanıcı adı veya şifreniz yanlış");
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((random.nextInt(10)));
        }
        return email + ":" + password + ":" + sb;
    }



}
