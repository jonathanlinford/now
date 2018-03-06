import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import dto.RegisterRequest;
import dto.RegisterResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

public class RegisterHandler extends NOWHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        boolean success = false;

        try{
            //Determine HTTP request type
            if(exchange.getRequestMethod().toLowerCase().equals("post")){
                InputStream reqBody = exchange.getRequestBody();

                String reqData = readString(reqBody);

                //Create and send the request. Receive response
                RegisterRequest request = (RegisterRequest) Serializer.decoder(reqData, RegisterRequest.class);
                RegisterResponse response = Services.getInstance().register(request);
                String respData = Serializer.encoder(response);

                //Send the response
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                OutputStream respBodyStream = exchange.getResponseBody();
                writeString(respData, respBodyStream);

                respBodyStream.close();

                success = true;
            }

            if(!success){
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_REQUEST, 0);
                exchange.getResponseBody().close();
            }
        }catch(IOException ex){
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_SERVER_ERROR, 0);
            exchange.getResponseBody().close();
            ex.printStackTrace();
        }
    }
}
