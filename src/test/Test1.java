package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by diman on 18.04.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 4567);
//            ServerSocket server = new ServerSocket(1234);
//            Socket sock = server.accept();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
