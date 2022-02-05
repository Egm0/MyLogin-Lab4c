package ca.sait.lab4c.services;

import ca.sait.lab4c.models.User;

/**
 *
 * @author Earl Gerard Grande
 */
public class AccountService {
    
    public User login(String username, String password){
        if(username.equals("abe") && password.equals("password")){
            
            return new User(username, null);
            
        } else if (username.equals("barb") && password.equals("password")){
        
            return new User(username, null);
            
        } else {
            return null;
        }
    
    }
    
}
