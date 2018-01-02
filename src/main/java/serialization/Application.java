package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject();
        dataObject.setMyData("Very loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong data");
        File file = new File("store.bin");

        FileOutputStream fo = new FileOutputStream(file);

        try (ObjectOutputStream objOutputStream = new ObjectOutputStream(fo)) {
            objOutputStream.writeObject(dataObject);
            objOutputStream.flush();
        }

        FileInputStream fi = new FileInputStream(file);
        DataObject objNew;
        try (ObjectInputStream is = new ObjectInputStream(fi)) {
            objNew = (DataObject) is.readObject();
        }

        System.out.println(objNew.toString());
        System.out.println(objNew.getMyData());
    }
}