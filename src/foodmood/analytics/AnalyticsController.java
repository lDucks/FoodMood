/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.Food;
import foodmood.food.FoodHistoryUI;
import foodmood.food.FoodList;
import foodmood.login.LoginController;
import foodmood.navigation.NavigationController;
import foodmood.user.User;

/**
 *
 * @author justin
 */
public final class AnalyticsController extends NavigationController {

    private final AnalyticsNavigationUI theAnalyticAppUI;
    private final LoginController theLoginController;
    
    /**
     *
     * @param theLoginController
     */
    public AnalyticsController(LoginController theLoginController){
        super(theLoginController);
        this.theAnalyticAppUI = new AnalyticsNavigationUI(this);
        this.theLoginController = theLoginController;
        this.showNavigationUI();
    }
    
    /**
     * Shows the relation chart view
     * 
     * @param food The food to check
     * @param user The user to check
     */
    public void showRelationUI(Food food, User user){
        // TODO
    }
    
    
    /**
     * Shows the correlation chart view
     * 
     * @param food The food to check
     * @param user The user to check
     */
    public void showCorrelationUI(){
        CorrelationUI theUI = new CorrelationUI();
        theUI.setVisible(true);
        theAnalyticAppUI.setVisible(false);
    }
    
    @Override
    public void showNavigationUI(){
        theAnalyticAppUI.setVisible(true);
    }
}
