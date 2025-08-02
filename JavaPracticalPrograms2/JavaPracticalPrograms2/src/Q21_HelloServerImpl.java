//21. Write a program to implement the concept of RMI(Remote Method Invocation)

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Q21_HelloServerImpl extends UnicastRemoteObject implements Q21_Hello {
	Q21_HelloServerImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from RMI Server!";
    }

    public static void main(String[] args) {
        try {
        	Q21_HelloServerImpl obj = new Q21_HelloServerImpl();
            LocateRegistry.createRegistry(1099); // start RMI registry on port 1099
            Naming.rebind("HelloService", obj); // bind service
            System.out.println("RMI Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
