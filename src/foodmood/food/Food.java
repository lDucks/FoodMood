/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import java.io.Serializable;

/**
 *
 * @author justin
 */
public class Food implements Serializable {

    private final String name;
    
    /**
     * The default constructor
     *
     * @param name The name parameter
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
