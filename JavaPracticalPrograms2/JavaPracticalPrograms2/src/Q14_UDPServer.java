//14. Write a client and server programs using TCP and UDP.
import java.net.*;

public class Q14_UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(4321);
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        System.out.println("UDP Server started...");

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);
        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received: " + message);

        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();

        String response = "Hello " + message;
        sendData = response.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        serverSocket.send(sendPacket);

        serverSocket.close();
    }
}
