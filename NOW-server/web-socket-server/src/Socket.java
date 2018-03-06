import javax.websocket.server.ServerEndpoint;

import org.eclipse.jetty.websocket.api.*;
import org.eclipse.jetty.websocket.api.Session;
import javax.websocket.*;
import org.eclipse.

/**
 * Created by jaslinfo on 3/5/18.
 */
public class Socket implements WebSocketListener{
    @Override
    public void onWebSocketBinary(byte[] bytes, int i, int i1) {}

    @Override
    public void onWebSocketClose(int i, String s) {

    }

    @Override
    public void onWebSocketConnect(Session session) {

    }

    @Override
    public void onWebSocketError(Throwable throwable) {

    }

    @Override
    public void onWebSocketText(String s) {
    }
}
