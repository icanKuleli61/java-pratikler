package observer_ecommerce;

public class User implements Observer {

    private  String username;

    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void handler(String message) {
        System.out.println(this.username);
        System.out.println(message);
    }
}
