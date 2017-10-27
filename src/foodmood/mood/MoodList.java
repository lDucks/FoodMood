/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.mood;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class MoodList implements Serializable {

    private final ArrayList<Mood> theMoodList;

    /**
     * The default constructor
     */
    public MoodList() {
        theMoodList = new ArrayList<>();
    }

    /**
     * Add a mood to the MoodList
     *
     * @param theMoodToAdd The mood to add
     */
    public void addMood(Mood theMoodToAdd) {
        theMoodList.add(theMoodToAdd);
    }

    /**
     * Remove a Mood from the MoodList by index
     *
     * @param index The index of the Mood to remove.
     */
    public void removeMood(int index) {
        theMoodList.remove(index);
    }

    /**
     * Remove a mood from the MoodList by object
     *
     * @param theMoodToRemove The Mood object to remove.
     */
    public void removeMood(Mood theMoodToRemove) {
        theMoodList.remove(theMoodToRemove);
    }

    /**
     * Returns the mood at a given index
     * 
     * @param index The index to return
     * @return The mood at the given index
     */
    public Mood get(int index) {
        return theMoodList.get(index);
    }
}
