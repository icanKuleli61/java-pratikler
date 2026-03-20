package app;

import builder_httpRequest.Http;
import builder_httpRequest.MethodRequest;

import java.net.http.HttpRequest;

public class Main {


    public static void main(String[] args){


        User user1 = new User.Builder("duhangünay@gmail.com","123456")
                .setUsername("günay")
                .setAge(24)
                .build();

        User user2 = new User.Builder("alican@gmail.com","1239912309")
                .setUsername("ali")
                .setAge(25)
                .build();

        User user3 = new User.Builder("ilyas@gmail.com","1231231")
                .setUsername("can")
                .setAge(26)
                .build();

        UserData userData = new UserData();
        userData.addUser(user1);
        userData.addUser(user2);
        userData.addUser(user3);

        Auth login = new Auth(new JwtToken());
        String token = login.login(userData, "ilyas@gmail.com", "1231231");

        HtppRequest request = new HtppRequest.Builder("localhost:8080/api/users", Method.GET)
                .addHeader("Authorization",token)
                .setBody("Mesaj")
                .build();

        System.out.println("----------------");
        System.out.println();
        RequestProcessor requestProcessor = new RequestProcessor(request,login);

        requestProcessor.httpRequestControl(userData);




    }
}
