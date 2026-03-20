package ChatRoom;

public class User implements Observer {

    private long  id;

    private String name;

    private String surname;

    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void chatInputRoom(ChatRoom chatRoom,Message message) {
        chatRoom.chatRoomHandler(message);
    }

    @Override
    public void chatOutputRoom(Message message) {
        if (this.id == message.getUser().id){
            return;
        }
        System.out.println(this.name + this.surname+" mesaj geldi");
        System.out.println(message.getUser().name +": "+message.getMessage());
        System.out.println("----------------------------");
        System.out.println();
    }
}
