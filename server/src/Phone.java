import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Phone extends Remote {
    public void sendMessage(Message msg) throws RemoteException;
}
