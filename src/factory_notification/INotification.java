package factory_notification;

public abstract class INotification {

    public String name;

    public INotification(String name){
        this.name = name;
    }

    abstract void send(String message);
}
