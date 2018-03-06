import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class NOWServer {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NOWServer server = new NOWServer();
        server.run();
    }

    private void run(){

        try {
            HttpServer server = HttpServer.create();

            server.createContext("/user/login", new LoginHandler());
            System.out.println("/user/login endpoint created");
            server.createContext("/user/register", new RegisterHandler());
            System.out.println("/user/register endpoint created");
            server.createContext("/user/friends", new FriendsHandler());
            System.out.println("/user/friends endpoint created");

            server.start();
            System.out.println("Server started...");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
