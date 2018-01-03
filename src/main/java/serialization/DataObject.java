package serialization;

import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable {
    private int i = 5;
    private String s = "Data";
    private CustomObject customObject;

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", customObject=" + customObject +
                '}';
    }
}
