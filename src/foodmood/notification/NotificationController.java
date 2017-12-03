/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.notification;

import foodmood.food.Food;
import foodmood.mood.Mood;
import foodmood.user.User;
import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class NotificationController {

    private final User theUserToCheck;
    private final long curTime;

    /**
     *
     * @param theUserToCheck
     */
    public NotificationController(User theUserToCheck) {
        this.theUserToCheck = theUserToCheck;
        this.curTime = System.currentTimeMillis();
    }

    public void checkForFoodNotification() {
        Food theLastFood = theUserToCheck.getFoodHistory().getLastFood();
        if (theLastFood == null || (curTime - theLastFood.getTimeAdded() > 60000 * 60 * 4)) {
            JOptionPane.showMessageDialog(null, "It has been 4 hours since you last entered a food, remember to add a food now!");
        }

    }

    public void checkForMoodNotification() {
        Mood theLastMood = theUserToCheck.getMoodHistory().getLastMood();
        if (theLastMood == null || (curTime - theLastMood.getTimeAdded() > 60000 * 60 * 4)) {
            JOptionPane.showMessageDialog(null, "It has been 4 hours since you last entered a mood, remember to add a mood now!");
        }
    }

}
