package tcpPackage;

import java.net.URL;

public class URLDemo {

public static void main(String[] args) { 
 try { 
  // Url 
  URL url = new URL("http://tutorials.jenkov.com/java-networking/udp-datagram sockets.html"); 
  // Informations 
  System.out.println("Protocol:" + url.getProtocol());// Protocol(eg. http) 
  System.out.println("Hostname:" + url.getHost()); // Server name or IP address eg. tutorials.jenkov.com 
  System.out.println("Portnumber:" + url.getPort()); // optional attribute default is 80 
  System.out.println("Filename:" + url.getFile()); // file name or directory name  
         // eg. java-networking/udp-datagramsockets.html 
 } catch (Exception ex) { 
  System.err.println(ex); 
 } 
}
}
