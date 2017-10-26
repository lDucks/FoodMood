package foodmood.user;

import foodmood.food.FoodConsumed;
import foodmood.notification.NotificationList;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class User {

    private String username;
    private char[] password;
    private final NotificationList theNotificationList;
    private final ArrayList<FoodConsumed> theFoodConsumed;

    public User(String newUsername, char[] newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        this.theNotificationList = new NotificationList();
        this.theFoodConsumed = new ArrayList<>();
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setPassword(char[] newPassword) {
        this.password = newPassword;
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
}
