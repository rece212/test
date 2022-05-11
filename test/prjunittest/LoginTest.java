/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjunittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rwanv
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testCheckLogin()
    {
        Login l = new Login();
        boolean Actual = l.UserName("Ree?ce");
        boolean Expected = true;
        
        assertEquals(Expected,Actual);
        
    }
    
    @Test
    public void TestLogin()
    {
        Login l = new Login();
        String Actual = l.Login(89);
        String Expected = "Welcome to the application , enjoy your day";
        
        assertEquals(Expected,Actual);
        
    }
    
}
