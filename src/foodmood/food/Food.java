/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

/**
 *
 * @author justin
 */
public class Food {

    private final String name;
    
    /**
     * The default constructor
     *
     * @param name
     */
    public Food(String name){
        this.name = name;
    }
    
    /**
     * Returns the name of the food
     *
     * @return name
     */
    public String getName(){
        return name;
    }
}
