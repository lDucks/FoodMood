/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class FoodList {
    
    
    private final ArrayList<Food> theFoodList;
    
    /**
     * The default constructor
     */
    public FoodList(){
        theFoodList = new ArrayList<>();
    }
    
    /**
     * Add a food to the FoodList
     *
     * @param theFoodToAdd
     */
    public void addFood(Food theFoodToAdd){
        theFoodList.add(theFoodToAdd);
    }
    
    /**
     * Remove a food from the FoodList by index
     * 
     * @param index
     */
    public void removeFood(int index){
        theFoodList.remove(index);
    }
    
    /**
     * Remove a food from the FoodList by object
     * 
     * @param theFoodToRemove
     */
    public void removeFood(Food theFoodToRemove){
        theFoodList.remove(theFoodToRemove);
    }
}

