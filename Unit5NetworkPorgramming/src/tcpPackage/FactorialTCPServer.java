package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialTCPServer {

    public FactorialTCPServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("The server is running and waiting for clients...");

        while (true) { // Keep the server running for multiple clients
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            new Thread(() -> handleClient(socket)).start();
        }
    }

    private void handleClient(Socket socket) {
        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int number = in.readInt();  // Client sends an integer
            System.out.println("Received number from client: " + number);

            long factorial = calculateFactorial(number);

            out.writeUTF("Factorial of " + number + " is " + factorial);

            in.close();
            out.close();
            socket.close();
            System.out.println("Client disconnected.\n");

        } catch (IOException e) {
            System.out.println("Error handling client: " + e.getMessage());
        }
    }

    private long calculateFactorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new FactorialTCPServer();
    }
}
