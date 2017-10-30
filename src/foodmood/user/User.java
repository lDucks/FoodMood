package foodmood.user;

import foodmood.food.Food;
import foodmood.food.FoodList;
import foodmood.mood.Mood;
import foodmood.mood.MoodList;
import java.io.Serializable;

/**
 *
 * @author Gisward
 */
public class User implements Serializable {

    private String username;
    private char[] password;
    private final FoodList theFoodList;
    private final MoodList theMoodList;

    public User(String newUsername, char[] newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        this.theFoodList = new FoodList();
        this.theMoodList = new MoodList();
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
     * The food consumed by the user
     *
     * @param theFoodConsumed The food consumed by the user
     */
    public void addFoodConsumed(Food theFoodConsumed) {
        this.theFoodList.addFood(theFoodConsumed);
    }

    /**
     * The mood of the user
     *
     * @param theMood The mood
     */
    public void addMood(Mood theMood) {
        this.theMoodList.addMood(theMood);
    }

    /**
     *
     * @return
     */
    public MoodList getMoodHistory() {
        return theMoodList;
    }

    public FoodList getFoodHistory() {
        return theFoodList;
    }
}
