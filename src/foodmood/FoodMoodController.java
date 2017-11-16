/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import foodmood.food.*;
import foodmood.mood.*;
import foodmood.navigation.NavigationController;

/**
 *
 * @author justin
 */
public class FoodMoodController {

    private final NavigationController theNavigationController;

    public FoodMoodController(NavigationController theNavigationController) {
        this.theNavigationController = theNavigationController;
    }

    public void showFoodUI() {
        FoodUI theFoodUI = new FoodUI(theNavigationController);
        theFoodUI.setVisible(true);
    }

    public void showMoodUI() {
        MoodUI theMoodUI = new MoodUI(theNavigationController);
        theMoodUI.setVisible(true);
    }

    public void showFoodHistoryUI() {
        FoodHistoryUI theFoodHistoryUI = new FoodHistoryUI(theNavigationController);
        theFoodHistoryUI.setVisible(true);
    }

    public void showMoodHistoryUI() {
        MoodHistoryUI theMoodHistoryUI = new MoodHistoryUI(theNavigationController);
        theMoodHistoryUI.setVisible(true);
    }

    public void addFoodToUser(String foodName) {
        Food theFood = new Food(foodName);
        theNavigationController.getCurrentUser().addFoodConsumed(theFood);
    }

    public void addMoodToUser(int rating) {
        Mood theMood = new Mood(rating);
        theNavigationController.getCurrentUser().addMood(theMood);
    }
}
