package dto;

import model.Conversation;

import java.util.List;

public class LoginResponse extends Response {
    String authToken;
    List<Conversation> conversation;

    public LoginResponse(){}

    public LoginResponse(boolean success, String message, String authToken, List<Conversation> conversations) {
        super(success, message);

        this.authToken = authToken;
        this.conversation = conversations;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public List<Conversation> getConversation() {
        return conversation;
    }

    public void setConversation(List<Conversation> conversation) {
        this.conversation = conversation;
    }
}
