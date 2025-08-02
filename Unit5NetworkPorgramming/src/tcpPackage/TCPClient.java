package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {

    public TCPClient() throws IOException {
        Socket socket = new Socket("localhost", 5555);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String clientRequest = "Hello Server, I want to connect with you. Send response if you are available.";
        out.writeUTF(clientRequest);

        String serverResponse = in.readUTF();
        System.out.println("Server says: " + serverResponse);

        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new TCPClient();
    }
}
