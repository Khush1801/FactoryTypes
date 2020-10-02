package customerApp;

public class CustomerFactory {
    public static ICustomerApp getCustomerApp(){
        return new CustomerAppImpl();
    }
}
