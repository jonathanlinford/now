package model;

import org.joda.time.DateTime;

import java.util.UUID;

public class Message {
    String messageID;
    String message;
    User sender;
    DateTime dateTime;

    public Message() {
    }

    public Message(String messageID, String message, User sender, DateTime dateTime) {
        this.messageID = messageID;
        this.message = message;
        this.sender = sender;
        this.dateTime = dateTime;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public static String idGenerator(){
        return "m_" + UUID.randomUUID().toString();
    }
}
