package customerApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(MockitoJUnitRunner.class)
public class TestMockedObj {
    @Mock
    Connection connection;

    @Mock
    PreparedStatement stmt;

    @Mock
    ResultSet resultset;

    @Test
    public void testCustomerApp() throws SQLException {
        assertNotNull(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(resultset);
    }
}
