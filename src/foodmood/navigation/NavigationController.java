/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.navigation;

import foodmood.controllers.FoodMoodController;

/**
 *
 * @author justin
 */
public class NavigationController {
    
    private final NavigationUI theNavUI;
    private final FoodMoodController theFoodMoodController;
    
    /**
     * The default constructor.
     */
    public NavigationController(){
        theNavUI = new NavigationUI();
        theFoodMoodController = new FoodMoodController();
    }
    
    /**
     * Shows the navigation UI.
     */
    public void showNavigationUI(){
        theNavUI.setVisible(true);
    }
    
    /**
     * Returns the food mood controller.
     * 
     * @return The FoodMoodController.
     */
    public FoodMoodController getFoodMoodController() {
        return theFoodMoodController;
    }
    
}
