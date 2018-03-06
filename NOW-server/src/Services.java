import dto.LoginRequest;
import dto.LoginResponse;
import dto.RegisterRequest;
import dto.RegisterResponse;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Services {
    private static Services ourInstance = new Services();

    public static Services getInstance() {
        return ourInstance;
    }

    //TODO: Data to be discarded after database established

    List<User> users = new ArrayList<>();
    List<Conversation> conversations = new ArrayList<>();
    Map<String, User> loggedInUsers = new HashMap<>();


    //TODO: Data to be discarded after database established

    private Services() {
    }

    public LoginResponse login(LoginRequest request){
        for(User u: users){
            if(u.getEmail().equals(request.getEmail()) && u.getPassword().equals(request.getPassword())){
                loggedInUsers.put()
            }
        }
        return null;
    }

    public RegisterResponse register(RegisterRequest request){
        return null;
    }

    public static String
}
