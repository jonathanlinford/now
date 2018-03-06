import dto.LoginRequest;
import dto.LoginResponse;
import dto.RegisterRequest;
import dto.RegisterResponse;
import model.*;

import java.util.*;

public class Services {
    private static Services ourInstance = new Services();

    public static Services getInstance() {
        return ourInstance;
    }

    //TODO: Data to be discarded after database established

    List<User> users = new ArrayList<>();
    List<Conversation> conversations = new ArrayList<>();
    Map<String, String> loggedInUsers = new HashMap<>();


    //TODO: Data to be discarded after database established

    private Services() {
    }

    public LoginResponse login(LoginRequest request){
        LoginResponse response;

        for(User u: users){
            if(u.getEmail().equals(request.getEmail()) && u.getPassword().equals(request.getPassword())){
                String authToken = authTokenGenerator();
                String userID = u.getUserID();
                loggedInUsers.put(authToken, userID);

                response = new LoginResponse(true, null, authToken, )

                break;
            }
        }
        return null;
    }

    public RegisterResponse register(RegisterRequest request){
        return null;
    }

    public List<Conversation> getUsersConversations(String userID){
        List<Conversation> returnConversations = new ArrayList<>();

        for(Conversation c: conversations){
            for(String uid: c.getUsers()){
                if(uid.equals(userID)){
                    returnConversations.add(c);
                    break;
                }
            }
        }

        if(returnConversations.size() == 0){
            return null;
        } else {
            return returnConversations;
        }
    }

    public static String authTokenGenerator(){
        return "u_" + UUID.randomUUID().toString();
    }
}
