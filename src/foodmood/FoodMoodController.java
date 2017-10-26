/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import foodmood.food.Food;
import foodmood.food.FoodConsumed;
import foodmood.food.FoodHistoryUI;
import foodmood.food.FoodList;
import foodmood.food.FoodUI;
import foodmood.mood.Mood;
import foodmood.user.User;
import foodmood.mood.MoodUI;
import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class FoodMoodController {

    private final ArrayList<User> theUserList;    
    private FoodUI theFoodUI;
    private MoodUI theMoodUI;
    private FoodHistoryUI theFoodHistoryUI;
    private final FoodList theFoodList;
    
    private static FoodMoodController theFoodMoodControllerSingleton;
    
    /**
     * The static FoodMoodController instance
     * 
     * @return the FoodMoodController singleton
     */
    public static FoodMoodController getFoodMoodController() {
        if(theFoodMoodControllerSingleton == null){
            theFoodMoodControllerSingleton = new FoodMoodController();
        }
        
        return theFoodMoodControllerSingleton;
    }
    
    /**
     * The default constructor
     */
    private FoodMoodController(){
        theUserList = new ArrayList<>();
        theFoodList = new FoodList();
    }
    
    /**
     * Takes a list of food and prompts the user for a mood rating, then adds the food to the user's history.
     *
     * @param theMood The user's mood
     * @param theFood The food consumed
     * @param theUser The user consuming the food
     */
    public void userConsumedFood(Mood theMood, Food theFood, User theUser){
        theFoodList.addFood(theFood);
        theUser.addFoodConsumed(new FoodConsumed(theFood, theMood));
    }
    
    /**
     * Returns the list of registered users for the application
     * 
     * @return The external userlist data.
     */
    public ArrayList<User> getUsers(){
        return theUserList;
    }

    /**
     * Shows the food UI.
     */
    public void showFoodUI() {
        theFoodUI = new FoodUI();
        theFoodUI.setVisible(true);
    }

    /**
     * Shows the mood UI.
     */
    public void showMoodUI() {
        theMoodUI = new MoodUI();
        theMoodUI.setVisible(true);
    }
    
    /**
     * Shows the food history UI
     */
    public void showFoodHistoryUI(){
        theFoodHistoryUI = new FoodHistoryUI();
        theFoodHistoryUI.setVisible(true);
    }

    public void showNavigationUI() {
        
    }
}
