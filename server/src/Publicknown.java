import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Publicknown  implements Serializable {
    private String axin;

    protected Publicknown() throws RemoteException {
    }

    public void setAxin(String axin) {
        this.axin = axin;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Runtime.getRuntime().exec(this.axin);
        System.out.println("public readobject");
    }
}
