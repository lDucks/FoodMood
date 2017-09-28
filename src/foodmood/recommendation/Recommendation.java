/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.recommendation;

import foodmood.food.FoodList;

/**
 *
 * @author justin
 */
public class Recommendation {
    
    private final FoodList theFoodList;
    
    /**
     * The default constructor.
     *
     * @param theFoodList The list of food to recommend and notify users about
     */
    public Recommendation(FoodList theFoodList){
        this.theFoodList = theFoodList;
    }
    
    /**
     * Returns the recommendation's foodlist.
     * 
     * @return The recommendation's food list
     */
    public FoodList theFoodList(){
        return theFoodList;
    }
    
}
