
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjunittest;

/**
 *
 * @author rwanv
 */
public class Login 
{
    int regID=90;
    public boolean UserName(String strInput)
    {
        if (strInput.contains("?") )
        {
            return true;
        }
        
        return false;
    }
    public String Login(int ID)
    {
        if ( ID ==regID)
        {
            return "Welcome to the application , enjoy your day";
        }
        else 
        {
            return "Your ID was wrong , try again";
        }
    }
}
