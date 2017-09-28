/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.Food;
import foodmood.models.user.User;

/**
 *
 * @author justin
 */
public class Relation {

    private final Food food;

    private final User user;
    
    /**
     * The default constructor
     * 
     * @param food The food to search for
     * @param user The user to search for a relation to the food
     */
    public Relation(Food food, User user){
        this.food = food;
        this.user = user;   
    }
    
    /**
     * Searches the user's food consumed history for relations to a specific food.
     */
    public void searchForRelation(){
        
    }
    
}
