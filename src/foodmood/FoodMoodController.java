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
import foodmood.mood.MoodHistoryUI;
import foodmood.mood.MoodUI;
import foodmood.navigation.NavigationController;
import foodmood.user.User;

/**
 *
 * @author justin
 */
public class FoodMoodController {

    private final FoodUI theFoodUI;
    private final MoodUI theMoodUI;
    private final FoodHistoryUI theFoodHistoryUI;
    private final FoodList theFoodList;
    private final MoodHistoryUI theMoodHistoryUI;

    /**
     * The default constructor
     * @param theNavigationController
     */
    public FoodMoodController(NavigationController theNavigationController) {
        theFoodList = new FoodList();
        theFoodUI = new FoodUI();
        theMoodUI = new MoodUI();
        theFoodHistoryUI = new FoodHistoryUI(theNavigationController);
        theMoodHistoryUI = new MoodHistoryUI(theNavigationController);
    }

    /**
     * Takes a list of food and prompts the user for a mood rating, then adds
     * the food to the user's history.
     *
     * @param theMood The user's mood
     * @param theFood The food consumed
     * @param theUser The user consuming the food
     */
    public void userConsumedFood(Mood theMood, Food theFood, User theUser) {
        theFoodList.addFood(theFood);
        theUser.addFoodConsumed(new FoodConsumed(theFood, theMood));
    }

    /**
     * Shows the food UI.
     */
    public void showFoodUI() {
        theFoodUI.setVisible(true);
    }

    /**
     * Shows the mood UI.
     */
    public void showMoodUI() {
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
}
