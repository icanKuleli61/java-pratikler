package generic_cache;

public class User {

    private long userId;

    private String userName;

    private  String surname;

    private String email;

    public User(long userId, String userName, String surname, String email) {
        this.userId = userId;
        this.userName = userName;
        this.surname = surname;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return userName + "\n" + surname + "\n" + email + "\n";
    }
}
