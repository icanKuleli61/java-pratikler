package app;

import java.util.Map;

public class RequestProcessor implements Observer{

    private HtppRequest htppRequest;

    private Auth auth;

    public RequestProcessor(HtppRequest htppRequest, Auth auth) {
        this.htppRequest = htppRequest;
        this.auth = auth;
    }

    public void httpRequestControl(UserData userData) {
        if (auth.tokenControl(getToken(),userData)){
            log();
        }else {
            throw new RuntimeException("Token hatalı");
        }
    }

    public String getToken(){
        Map<String, String> headers = htppRequest.getHeaders();
        return headers.get("Authorization");
    }


    @Override
    public void log() {
        System.out.println();
        System.out.println(htppRequest.getMethod()+ "  " +htppRequest.getUrl());
        System.out.println(htppRequest.getHeaders());
        System.out.println();
        System.out.println(htppRequest.getBody());
    }
}
