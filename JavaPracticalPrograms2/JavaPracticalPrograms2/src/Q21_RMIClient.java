//21. Write a program to implement the concept of RMI(Remote Method Invocation)

import java.rmi.*;

public class Q21_RMIClient {
    public static void main(String[] args) {
        try {
            Q21_Hello stub = (Q21_Hello) Naming.lookup("rmi://localhost/HelloService");
            System.out.println("Client received: " + stub.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

