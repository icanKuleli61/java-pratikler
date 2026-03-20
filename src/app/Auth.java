package app;

public class Auth {

    private AuthStrategy strategy;

    public Auth(AuthStrategy strategy) {
        this.strategy = strategy;
    }


    public  String login(UserData data, String email, String password){
        return strategy.login(data,email, password);
    }

    public boolean tokenControl(String token, UserData data){
        if (token == null ||  data == null){
           throw  new RuntimeException("Token , data Boş olamaz");
        }
        String[] split = token.trim().split(":");

        if (split.length != 3){
            throw new RuntimeException("Token hatalı");
        }

        String email = split[0];
        String password = split[1];

        for (User user : data.getUsers()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){
                return true;
            }
        }

        return false;


    }





}
