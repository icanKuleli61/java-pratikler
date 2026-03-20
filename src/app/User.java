package app;

public class User {

    private final String username;

    private final String email;

    private final String password;

    private final int age;

    public User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.age = builder.age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String username;

        private String email;

        private String password;

        private int age;

        public Builder(String email, String password){
            this.email = email;
            this.password = password;
        }

        public Builder setUsername(String username){
            this.username = username;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
