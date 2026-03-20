package ChatRoom;


import java.util.ArrayList;
import java.util.List;

public class ChatRoom {


    private String roomName;

    private List<Observer> observer = new ArrayList<>();

    public ChatRoom(String roomName) {
        this.roomName = roomName;
    }

    public void joinRoom(Observer observer) {
        this.observer.add(observer);
    }

    public void leaveRoom(Observer observer) {
        this.observer.remove(observer);
    }

    public void chatRoomHandler(Message message){
        if (message == null) {
            throw new NullPointerException("Message is null");
        }
            charRoomPublisher(message);
    }


    public void charRoomPublisher(Message message){
        if (observer.isEmpty()) {
            throw new NullPointerException("Abone yok.");
        }
        for (Observer observer : observer) {
            observer.chatOutputRoom(message);
        }

    }








}
