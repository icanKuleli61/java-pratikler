package builder_httpRequest;

import java.util.HashMap;
import java.util.Map;

public class Http {

    private final String url;

    private final MethodRequest method;

    private final String body;

    private final long timer;

    private final Map<String, String> headers;


    public Http(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
        this.timer = builder.timer;
    }

    public static class Builder {
        private String url;
        private MethodRequest method;
        private Map<String, String> headers = new HashMap<>();
        private String body;
        private long timer;

        public Builder(String url, MethodRequest method) {
            if (url == null || method == null){
                throw new IllegalArgumentException("Url and method cannot be null");
            }
            this.url = url;
            this.method = method;
        }

        public Builder addHeader(String key, String value){
            headers.put(key,value);
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setTimeout(long timer) {
            this.timer = timer;
            return this;
        }
        public Http build(){
            return new Http(this);
        }
    }


}
