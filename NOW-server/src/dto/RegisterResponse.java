package dto;

import model.Conversation;

import java.util.List;

public class RegisterResponse extends Response{
    String authToken;
    List<Conversation> conversation;

    public RegisterResponse(){}

    public RegisterResponse(boolean success, String message, String authToken, List<Conversation> conversations) {
        super(success, message);

        this.authToken = authToken;
        this.conversation = conversations;
    }

    @Override
    public boolean isSuccess() {
        return super.isSuccess();
    }

    @Override
    public void setSuccess(boolean success) {
        super.setSuccess(success);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(message);
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
