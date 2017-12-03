/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author justin
 */
public class FoodList implements Serializable {

    private final ArrayList<Food> theFoodList;

    /**
     * The default constructor
     */
    public FoodList() {
        theFoodList = new ArrayList<>();
    }

    public FoodList(ArrayList<Food> theFoodArray) {
        this.theFoodList = theFoodArray;
    }

    /**
     * Add a food to the FoodList
     *
     * @param theFoodToAdd The food to add
     */
    public void addFood(Food theFoodToAdd) {
        theFoodList.add(theFoodToAdd);
    }

    /**
     * Remove a food from the FoodList by object
     *
     * @param theFoodToRemove The food object to remove.
     */
    public void removeFood(Food theFoodToRemove) {
        theFoodList.remove(theFoodToRemove);
    }

    /**
     * Returns the food at a given index
     * 
     * @param index The index to return
     * @return The food at the given index
     */
    public Food get(int index) {
        return theFoodList.get(index);
    }

    public String[] toArray() {
        return  theFoodList.stream().map(food -> food.getName() + " - " + food.getDateAdded()).collect(Collectors.toList()).toArray(new String[0]);
    }

    public ArrayList getList() {
       return theFoodList;
    }

    public Food getLastFood() {
        if (theFoodList.isEmpty()) {
            return null;
        }
        return this.get(theFoodList.size() - 1);
    }
}
