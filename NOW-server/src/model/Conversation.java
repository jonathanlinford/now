package model;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.UUID;

public class Conversation {
    String conversationID;
    ArrayList<Message> messages;
    DateTime started;
    ArrayList<String> users;

    public Conversation() {
    }

    public Conversation(String conversationID, ArrayList<Message> messages, DateTime started, ArrayList<String> users) {
        this.conversationID = conversationID;
        this.messages = messages;
        this.started = started;
        this.users = users;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public DateTime getStarted() {
        return started;
    }

    public void setStarted(DateTime started) {
        this.started = started;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public static String idGenerator(){
        return "c_" + UUID.randomUUID().toString();
    }
}
