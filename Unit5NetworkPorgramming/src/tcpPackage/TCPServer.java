package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public TCPServer() throws IOException  {
		ServerSocket ss =new ServerSocket(5555);//using the same port
		Socket soc = ss.accept();//accept the data from client and open socket for sending response
		DataInputStream in = new DataInputStream(soc.getInputStream());//get request
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());//send request

		// obtain request
		System.out.println("Server is running");
		String request = in.readUTF();
		System.out.println("The response is=" + request);

		// send response
		String response = "Hello client, I got your message, How may I help you";
		out.writeUTF(response);

		soc.close();
		ss.close();
	}

	public static void main(String[] args) throws IOException {
		new TCPServer();
	}

}

