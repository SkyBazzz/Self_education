package patterns.null_object.preparation_data;

/**
 * The type Real customer.
 */
public class RealCustomer extends AbstractCustomer {

    /**
     * Instantiates a new Real customer.
     *
     * @param name the name
     */
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
