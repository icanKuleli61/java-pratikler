package app;

public enum Method {

    POST("Yeni bir kaynak oluşturur"),
    GET("Mevcut kaynakları getirir"),
    PUT("Kaynağı günceller"),
    DELETE("Kaynağı siler");

    private final String message;

    Method(String message){
        this.message = message;
    }
}
