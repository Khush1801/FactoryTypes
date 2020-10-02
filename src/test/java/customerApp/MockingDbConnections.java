package customerApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(MockitoJUnitRunner.class)
public class MockingDbConnections {
    public MockingDbConnections(){
        System.out.println("Constructor called");
    }

    @Mock
    Connection connection;

    @Mock
    PreparedStatement stmt;

    @Mock
    ResultSet rs;

    @Before
    public void setup() throws Throwable {
//        Test Double
        when(connection.prepareStatement(any(String.class))).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(rs);
        when(rs.next()).thenReturn(true);
        when(rs.getString("username")).thenReturn("Abc");
        when(rs.getString("password")).thenReturn("a-23");
    }

    @Test
    public void test() throws Throwable{
        assertNotNull(connection);
        stmt=connection.prepareStatement("select * from users");
        rs=stmt.executeQuery();
        if(rs.next()){
            String uname=rs.getString("username");
            String pwd=rs.getString("password");
            System.out.println(uname);
            System.out.println(pwd);
        }
    }

    @Test
    public void test1(){

    }

    @Test
    public void test2(){

    }
}
