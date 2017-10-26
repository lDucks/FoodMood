/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.login;

import foodmood.FoodMoodController;
import foodmood.user.User;
import java.util.Arrays;

/**
 *
 * @author justin
 */
public class LoginController {

    private User currentUser;
    private final LoginUI theLoginUI;
    
    /**
     * The default constructor
     */
    public LoginController(){
        this.theLoginUI = new LoginUI(this);
        theLoginUI.setVisible(true);
    }
    
    /**
     * Checks a user's information and logs them in.
     * 
     * @param username The user's username
     * @param password The user's password
     * @return If the user was logged in or not
     */
    public boolean login(String username, char [] password){
        User u = new User(username);
        this.currentUser = u;
        
        boolean authenticated = u.authenticate(Arrays.toString(password));
        if(authenticated){
            FoodMoodController.getFoodMoodController().showNavigationUI();
        }
        
        return authenticated;
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
