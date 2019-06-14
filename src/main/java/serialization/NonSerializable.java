package serialization;

/**
 * This parent would not be serialized because he doesn't implement Serializable or Externalizable
 */
public class NonSerializable {
    private String myData = "";

    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }
}
