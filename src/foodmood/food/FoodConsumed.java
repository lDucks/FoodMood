/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import foodmood.mood.Mood;

/**
 *
 * @author justin
 */
public class FoodConsumed {
    
    private final long timeEaten;
    private final FoodList theFoodList;
    private final Mood mood;
    
    /**
     *
     * @param theFoodList The list of food eaten for the food consumed
     * @param mood The user's mood after consuming the food
     */
    public FoodConsumed(FoodList theFoodList, Mood mood){
        this.timeEaten = System.currentTimeMillis();
        this.theFoodList = theFoodList;
        this.mood = mood;
    }
    
    /**
     * Returns the list of food eaten
     * 
     * @return The list of food
     */
    public FoodList getFoodList(){
        return theFoodList;
    }
  
    /**
     * Returns the user's mood after the food was consumed.
     *
     * @return The mood
     */
    public Mood getMood(){
        return mood;
    }
    
    /**
     * Returns the time the food was consumed.
     *
     * @return The time the food was consumed
     */
    public long getTimeEaten(){
        return timeEaten;
    }
}
