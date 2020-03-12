import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry registry;
        registry = LocateRegistry.createRegistry(1099);
        System.out.println("Registry listening on 1099....");
        PhoneImpl phone = new PhoneImpl();
        Phone phone1 = (Phone)UnicastRemoteObject.exportObject(phone, 0);
        registry.rebind("phone", phone1);
    }
}
