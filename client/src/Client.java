import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Message msg = new Message();
        msg.setMessage("nihao");
        Publicknown publicknown = new Publicknown();
        publicknown.setAxin("calc.exe");
        publicknown.setMessage("hello");
        Registry registry = LocateRegistry.getRegistry(1099);
        Phone phone = (Phone) registry.lookup("phone");
        phone.sendMessage(publicknown);
    }
}
