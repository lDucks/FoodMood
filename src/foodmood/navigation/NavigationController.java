/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.navigation;

import foodmood.FoodMoodController;
import foodmood.analytics.AnalyticsController;

/**
 *
 * @author justin
 */
public class NavigationController {

    private final NavigationUI theNavUI;
    private final AnalyticsController theAnalyticsController;
    private final FoodMoodController theFoodMoodController;

    /**
     * The default constructor.
     */
    public NavigationController() {
        theNavUI = new NavigationUI();
        theAnalyticsController = new AnalyticsController();
        theFoodMoodController = new FoodMoodController();
    }

    /**
     * Shows the navigation UI.
     */
    public void showNavigationUI() {
        theNavUI.setVisible(true);
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

}
