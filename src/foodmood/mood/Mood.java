package foodmood.mood;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Mood {

    private final int rating;
    
    /**
     * The default constructor
     * 
     * @param rating The rating for the mood. Accepts 1 to 5.
     */
    public Mood(int rating){
        this.rating = rating;
    }

    public Mood() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Returns the user's mood
     *
     * @return The rating
     */
    public int getRating(){
       return rating;
    }
    
}
