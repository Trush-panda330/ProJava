package projava;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(1700)) {
            System.out.println("Waiting...");
            try (Socket soc = server.accept()) {
                System.out.println("Connected from " + soc.getInetAddress());

                InputStream input = soc.getInputStream();
                int data = input.read();
                if (data != -1) {
                    System.out.println("Received data: " + data);
                } else {
                    System.out.println("No data received.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
