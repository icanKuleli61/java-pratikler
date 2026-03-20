package builder_httpRequest;

public enum MethodRequest {
    POST("Yeni bir kaynak oluşturur"),
    GET("Mevcut kaynakları getirir"),
    PUT("Kaynağı günceller"),
    DELETE("Kaynağı siler");

    private final String message;

    MethodRequest(String message){
        this.message = message;
    }

}
