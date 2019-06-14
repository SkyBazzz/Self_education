package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @see java.io.Externalizable
 */
public class CustomObject implements Externalizable {
    boolean b;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBoolean(b);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readBoolean();
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "b=" + b +
                '}';
    }
}