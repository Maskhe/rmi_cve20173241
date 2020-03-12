import java.rmi.RemoteException;

public class PhoneImpl implements Phone{
    @Override
    public void sendMessage(Message msg) throws RemoteException {
        System.out.println("You send: " + msg.getMessage());
    }
}
