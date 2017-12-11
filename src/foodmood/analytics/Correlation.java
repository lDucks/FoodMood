/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.Food;
import foodmood.food.FoodList;
import foodmood.mood.Mood;

/**
 *
 * @author justi
 */
public class Correlation {

    private int totalMood = 0;
    private FoodList theFoodList = new FoodList();

    public FoodList getFoodList(){
        return theFoodList;
    }
     
    public int getTotalMood() {
        return totalMood;
    }

    public void incrementMood(Mood mood) {
        totalMood += mood.getRating();
    }

    public void addFood(Food theFood) {
        theFoodList.addFood(theFood);
    }
}
