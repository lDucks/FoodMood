/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.navigation;

import foodmood.FoodMoodController;
import foodmood.food.FoodHistoryUI;
import foodmood.analytics.AnalyticsController;
import foodmood.login.LoginController;
import foodmood.mood.MoodHistoryUI;
import foodmood.user.User;

/**
 *
 * @author justin
 */
public class NavigationController {

    private final NavigationUI theNavUI;
    private final AnalyticsController theAnalyticsController;
    private final FoodMoodController theFoodMoodController;
    private final LoginController theLoginController;

    /**
     * The default constructor.
     * @param theLoginController
     */
    public NavigationController(LoginController theLoginController) {
        theNavUI = new NavigationUI(this);
        theAnalyticsController = new AnalyticsController();
        theFoodMoodController = new FoodMoodController(this);
        this.theLoginController = theLoginController;
    }

    /**
     * Shows the navigation UI.
     */
    public void showNavigationUI() {
        theNavUI.setVisible(true);
    }
    
    /**
     * Hides the navigation UI.
     */
    public void hideNavigationUI() {
       theNavUI.setVisible(false);
    }

    /**
     * Returns the analytics controller
     *
     * @return The analytics controller
     */
    public AnalyticsController getAnalyticsController() {
        return theAnalyticsController;
    }

    public FoodMoodController getFoodMoodController() {
        return theFoodMoodController;
    }

    /**
     *
     * @return
     */
    public User getCurrentUser() {
        return theLoginController.getCurrentUser();
    }

}
