package observer_youtube_system;


public class User implements Observer {

    private String name;

    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public void update(String message,String kanalName) {
        System.out.println(this.name );
        System.out.println(kanalName + " Kanalı "+message+ " Adında yeni bir video yükledi.");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
