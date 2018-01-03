package patterns.null_object.preparation_data;

/**
 * The type Customer factory.
 */
public class CustomerFactory {

    private static final String[] names = {"Rob", "Joe", "Julie"};

    /**
     * Get customer abstract customer.
     *
     * @param name the name
     * @return the abstract customer
     */
    public static AbstractCustomer getCustomer(String name){

        for (String customer : names) {
            if (customer.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}