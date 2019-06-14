package serialization;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject();
        dataObject.setMyData("Very loooooooooooooooooooooooooong daa");
        File file = new File("store.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fo);
        objOutputStream.writeObject(dataObject);
        objOutputStream.flush();
        objOutputStream.close();

        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream is = new ObjectInputStream(fi);
        DataObject objNew = (DataObject) is.readObject();
        is.close();

        System.out.println(objNew.toString());
        System.out.println(objNew.toString());



    }
}
