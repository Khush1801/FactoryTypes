package customerApp;

import RemoteApp.ILogin;

public class LoginApp {
    private ILogin login;

    LoginApp(ILogin login){
        this.login=login;
    }

    public void Login(String uname){
        String unamedb=login.getUserName();
        if(unamedb != null &&  !unamedb.equals(uname)){
            throw new RuntimeException("Username incorrect");
        }
        else{
            System.out.println("Logged in.");
        }
    }
}
