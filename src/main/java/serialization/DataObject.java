package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Practise with serialization
 * Write and read object have to have the same sequence
 * @see java.io.Serializable
 */
public class DataObject extends NonSerializable implements Serializable {
    private int i = 5;
    private String s = "Data";
    private CustomObject customObject = new CustomObject();
    transient String transString = "Sobaka";

    /**
     * if you want custom serialization you should use this method
     *
     * @param objectOutputStream which object would be serialize
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        //better always ust it before custom serialization
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getMyData());
    }

    /**
     * if you want custom deserialization you should use this method
     *
     * @param objectInputStream which object would be deserialize
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        //better always ust it before custom deserialization
        objectInputStream.defaultReadObject();
        setMyData((String) objectInputStream.readObject());
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", customObject=" + customObject +
                ", transString='" + transString + '\'' +
                '}';
    }
}