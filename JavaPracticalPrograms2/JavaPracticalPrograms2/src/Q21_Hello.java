//21. Write a program to implement the concept of RMI(Remote Method Invocation)

import java.rmi.*;

public interface Q21_Hello extends Remote {
    String sayHello() throws RemoteException;
}
