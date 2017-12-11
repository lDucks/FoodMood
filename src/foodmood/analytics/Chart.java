/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author justi
 */
public class Chart {

    private ArrayList<Double> values;
    private ArrayList<Color> colors;
    private ArrayList<String> labels;

    public Chart() {
        values = new ArrayList<>();
        colors = new ArrayList<>();
        labels = new ArrayList<>();
    }

    /**
     *
     * @param values
     * @param colors
     * @param labels
     */
    public Chart(ArrayList<Double> values, ArrayList<Color> colors, ArrayList<String> labels) {
        this.values = values;
        this.colors = colors;
        this.labels = labels;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public ArrayList<Double> getValues() {
        return values;
    }

    public void setValues(ArrayList<Double> values) {
        this.values = values;
    }

    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }
}
