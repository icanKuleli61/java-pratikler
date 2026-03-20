package app;

import java.util.HashMap;
import java.util.Map;

public class HtppRequest {

    private final String url;

    private final Method method;

    private final String body;

    private final Map<String, String> headers;

    private final int timerOut;

    public String getUrl() {
        return url;
    }

    public Method getMethod() {
        return method;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public int getTimerOut() {
        return timerOut;
    }

    public  HtppRequest(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.headers = builder.headers;
        this.timerOut = builder.timerOut;
    }


    public static class Builder {
        private  String url;

        private  Method method;

        private  String body;

        private  Map<String, String> headers = new HashMap<>();

        private  int timerOut;

        public Builder(String url, Method method){
            this.url = url;
            this.method = method;
        }

        public Builder setBody(String body){
            this.body = body;
            return this;
        }

        public Builder addHeader(String key, String value){
            this.headers.put(key, value);
            return this;
        }

        public Builder setTimerOut(int timerOut){
            this.timerOut = timerOut;
            return this;
        }

        public HtppRequest build(){
            return new HtppRequest(this);
        }

    }


}
