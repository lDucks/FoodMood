/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.login;

import foodmood.user.User;

/**
 *
 * @author justin
 */
public class LoginController {

    private User currentUser;
    
    /**
     * Checks a user's information and logs them in.
     * 
     * @param username The user's username
     * @param password The user's password
     * @return If the user was logged in or not
     */
    public boolean login(String username, String password){
        User u = new User(username);
        
        this.currentUser = u;
        
        return u.authenticate(password);
    }

    /**
     * Returns the currently logged in user.
     * 
     * @return The current user
     */
    public User getCurrentUser() {
       return currentUser;
    }
    
}
