/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.FoodList;
import foodmood.models.user.User;

/**
 *
 * @author justin
 */
public class Correlation {

    private final FoodList theFoodList;
    private final User theUser;
    
    /**
     * The default constructor
     * 
     * @param theFoodList The list of food to find correlations for
     * @param theUser The user to check mood history for
     */
    public Correlation(FoodList theFoodList, User theUser){
        this.theFoodList = theFoodList;
        this.theUser = theUser;
    }
    
    /**
     * Searches the food list and the user's food consumed history for correlations between foods and moods.
     */
    public void searchForCorrelations(){
        
    }
    
}
