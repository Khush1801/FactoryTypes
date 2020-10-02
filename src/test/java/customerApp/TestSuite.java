package customerApp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CustomerTest.class,
        DummyTest.class
})
public class TestSuite {
}
