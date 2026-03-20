package ChatRoom;

public interface Observer {

    void chatInputRoom(ChatRoom chatRoom, Message message);

    void chatOutputRoom(Message message);
}
