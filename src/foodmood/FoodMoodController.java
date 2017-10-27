/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import foodmood.food.Food;
import foodmood.food.FoodHistoryUI;
import foodmood.food.FoodList;
import foodmood.food.FoodUI;
import foodmood.mood.Mood;
import foodmood.mood.MoodHistoryUI;
import foodmood.mood.MoodUI;
import foodmood.navigation.NavigationController;
import foodmood.user.User;

/**
 *
 * @author justin
 */
public class FoodMoodController {

    private final FoodHistoryUI theFoodHistoryUI;
    private final FoodList theFoodList;
    private final MoodHistoryUI theMoodHistoryUI;
    private final NavigationController theNavigationController;

    /**
     * The default constructor
     * @param theNavigationController
     */
    public FoodMoodController(NavigationController theNavigationController) {
        theFoodList = new FoodList();
        this.theNavigationController = theNavigationController;
        theFoodHistoryUI = new FoodHistoryUI(theNavigationController);
        theMoodHistoryUI = new MoodHistoryUI(theNavigationController);
    }

    /**
     * Shows the food UI.
     */
    public void showFoodUI() {
        FoodUI theFoodUI = new FoodUI(theNavigationController);
        theFoodUI.setVisible(true);
    }

    /**
     * Shows the mood UI.
     */
    public void showMoodUI() {
        MoodUI theMoodUI = new MoodUI(theNavigationController);
        theMoodUI.setVisible(true);
    }

    /**
     * Shows the food history UI
     */
    public void showFoodHistoryUI() {
        theFoodHistoryUI.setVisible(true);
    }

    /**
     * Shows the mood history UI
     */
    public void showMoodHistoryUI() {
        theMoodHistoryUI.setVisible(true);
    }
    
    public void addFoodToUser(String foodName){
        Food theFood = new Food(foodName);
        theNavigationController.getCurrentUser().addFoodConsumed(theFood);
    }
    
    public void addMoodToUser(int rating){
        Mood theMood = new Mood(rating);
        theNavigationController.getCurrentUser().addMood(theMood);
    }
}
