package customerApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import RemoteApp.ILogin;

@RunWith(MockitoJUnitRunner.class)
public class TestLogin {
    @Mock
    ILogin iLogin;

    @Test
    public void testMyLogin(){
        assertNotNull(iLogin);
        when(iLogin.getUserName()).thenReturn("Khushboo");
        LoginApp app=new LoginApp(iLogin);
        app.Login("Khushboo");
    }
}
