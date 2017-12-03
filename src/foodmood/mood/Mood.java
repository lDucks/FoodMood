package foodmood.mood;

import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author justin
 */
public class Mood implements Serializable {

    private final int rating;
    private final long timestamp;

    /**
     * The default constructor
     *
     * @param rating The rating for the mood. Accepts 1 to 5.
     */
    public Mood(int rating) {
        this.timestamp = System.currentTimeMillis();
        this.rating = rating;
    }

    /**
     * Returns the user's mood
     *
     * @return The rating
     */
    public int getRating() {
        return rating;
    }

    public long getTimeAdded() {
        return timestamp;
    }

    public String getDateAdded() {
        Date date = new Date(timestamp);
        return date.toString();
    }

}
