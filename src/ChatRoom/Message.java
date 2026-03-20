package ChatRoom;

import java.util.Date;


public class Message {

    private int messageId;

    private String message;

    private User user;

    private Date date;


    public Message(int messageId, String message, User user, Date date) {
        this.messageId = messageId;
        this.message = message;
        this.user = user;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
