package builder_UserRegisterSystem;

public class User {


    private final String username;

    private final String email;

    private final String password;

    private final String phoneNumber;

    private final String address;

    private final int age;

    private final String bio;

    User(Builder builder){
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
        this.bio = builder.bio;
    }

    public static class Builder {

        private String username;

        private String email;

        private String password;

        private String phoneNumber;

        private String address;

        private int age;

        private String bio;


        public Builder(String username, String email, String password){
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public Builder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setBio(String bio){
            this.bio = bio;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }







}
