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
public class AnalyticsController extends NavigationController {

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
     * Returns the relation chart object
     *
     * @param food The food to check
     * @param user The user to check
     * @return The chart object
     */
    private Chart getRelationChart(Food food, User user){
        Relation relation = new Relation(food, user);
        Chart chart = new Chart(relation);
        return chart;
    }
    
    /**
     * Shows the relation chart view
     * 
     * @param food The food to check
     * @param user The user to check
     */
    public void showRelationChart(Food food, User user){
        Chart theChart = this.getRelationChart(food, user);
        theChart.generate();
        theChart.showChart();
    }
    
    /**
     * Returns the correlation chart
     * 
     * @param food The food to check
     * @param user The user to check
     */
    private Chart getCorrelationChart(FoodList food, User user){
        Correlation correlation = new Correlation(food, user);
        Chart chart = new Chart(correlation);
        return chart;
    }
    
    /**
     * Shows the correlation chart view
     * 
     * @param food The food to check
     * @param user The user to check
     */
    public void showCorrelationChart(FoodList food, User user){
        Chart theChart = this.getCorrelationChart(food, user);
        theChart.generate();
        theChart.showChart();
    }
    
    @Override
    public void showNavigationUI(){
        theAnalyticAppUI.setVisible(true);
    }
}
