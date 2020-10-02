package customerApp;

import org.junit.*;

import static org.junit.Assert.*;

public class CustomerTest {
    @BeforeClass
    public static void setupOnce(){
        System.out.println("Gets called only once before all tests.");
    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Gets called only once after all tests.");
    }

    @Before
    public void setup(){
        System.out.println("This method gets called before every test.");
    }

    @After
    public void teardown(){
        System.out.println("This method gets called after evry test.");
    }

    @Test(expected = InvalidValueException.class)
    public void testInvalidCustomerName(){
        Customer customer=new Customer();
        customer.setFname("a");
    }

    @Test
    public void testCustomerName(){
        Customer customer=new Customer();
        customer.setFname("aasad");
        int expected=3;
        int actual=customer.getFname().length();
        assertTrue(expected<=actual);
    }

    @Test(expected = InvalidValueException.class)
    public void testInvalidCustomerLastName(){
        Customer customer=new Customer();
        customer.setLname("a");
    }

    @Test
    public void testCustomerLastName(){
        Customer customer=new Customer();
        customer.setLname("asddc");
        int expected=3;
        int actual=customer.getLname().length();
        assertTrue(expected<=actual);
    }

    @Test
    @Ignore
    public void testCustomerNameValidChars(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerLastNameValidChars(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerNameMinLength(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerLastNameMinLength(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerValidEmailId(){
        fail();
    }
}
