package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class FactorialTCPClient {

    public FactorialTCPClient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        Socket socket = new Socket("localhost", 5555);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        out.writeInt(number);  // Send number to server

        String response = in.readUTF();
        System.out.println("Server says: " + response);

        in.close();
        out.close();
        socket.close();
        scanner.close();
    }
    public static void main(String[] args) throws IOException {
        new FactorialTCPClient();
    }
}


