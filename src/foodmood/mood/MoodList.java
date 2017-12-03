/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.mood;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public MoodList(ArrayList<Mood> theMoodArray) {
        theMoodList = theMoodArray;
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

    /**
     *
     * @return
     */
    public String[] toArray() {
       return theMoodList.stream().map(mood -> mood.getRating()+"").collect(Collectors.toList()).toArray(new String[0]);
    }

    public ArrayList getList() {
       return theMoodList;
    }
}
