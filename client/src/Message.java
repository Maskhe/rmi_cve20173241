import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Message implements Serializable {
    private String message;
    private static final long serialVersionUID = -6210579029160025375L;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("readobject");
    }
}
