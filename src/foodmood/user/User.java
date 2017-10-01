/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.user;

import foodmood.food.FoodConsumed;
import foodmood.notification.NotificationList;
import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class User {

    private final String username;
    private final NotificationList theNotificationList;
    private final ArrayList<FoodConsumed> theFoodConsumed;

    /**
     * Default constructor
     *
     * @param username The username of the user
     */
    public User(String username) {
        this.username = username;
        this.theNotificationList = new NotificationList();
        this.theFoodConsumed = new ArrayList<>();
    }

    /**
     * Authenticates the user with the given password.
     *
     * @param password The user's password
     * @return Whether or not the user is logged in.
     */
    public boolean authenticate(String password) {
        return false;
    }

    /**
     * Returns the user's username
     *
     * @return The user's username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Returns the user's food consumed history
     *
     * @return The history
     */
    public ArrayList<FoodConsumed> getFoodConsumed(){
        return theFoodConsumed;
    }
    
    /**
     * Returns the user's notification list
     *
     * @return The notification list
     */
    public NotificationList getNotificationList(){
        return theNotificationList;
    }
    
    /**
     * The food consumed by the user
     * 
     * @param theFoodConsumed The food consumed by the user
     */
    public void addFoodConsumed(FoodConsumed theFoodConsumed){
        this.theFoodConsumed.add(theFoodConsumed);
    }

    public void logout() {
       exit();
    }
}
