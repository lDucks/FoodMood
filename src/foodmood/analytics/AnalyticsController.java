/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.Food;
import foodmood.food.FoodList;
import foodmood.login.LoginController;
import foodmood.mood.Mood;
import foodmood.navigation.NavigationController;
import foodmood.user.User;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author justin
 */
public final class AnalyticsController extends NavigationController {

    private final AnalyticsNavigationUI theAnalyticAppUI;
    private Correlation theFoodToEat;
    private Correlation theFoodToAvoid;

    /**
     *
     * @param theLoginController
     */
    public AnalyticsController(LoginController theLoginController) {
        super(theLoginController);
        this.theAnalyticAppUI = new AnalyticsNavigationUI(this);
        this.showNavigationUI();

        generateCorrelations();
    }

    /**
     * Shows the relation chart view
     *
     * @param food The food to check
     * @param user The user to check
     */
    public void showRelationUI(Food food, User user) {
        // TODO
    }

    /**
     * Shows the correlation chart view
     *
     */
    public void showCorrelationUI() {
        CorrelationUI theUI = new CorrelationUI(this, getFoodToEat(), getFoodToAvoid());
        theUI.setVisible(true);
        theAnalyticAppUI.setVisible(false);
    }

    private void generateCorrelations() {
        ArrayList<Food> theFoodHistory = getCurrentUser().getFoodHistory().getList();
        ArrayList<Mood> theMoodHistory = getCurrentUser().getMoodHistory().getList();

        HashMap<Long, Correlation> correlations = new HashMap<>();

        for (Food theFood : theFoodHistory) {
            long timestamp = 1000 * (theFood.getTimeAdded() / (60 * 60 * 1000));

            if (!correlations.containsKey(timestamp)) {
                Correlation correlation = new Correlation();
                correlation.addFood(theFood);
                correlations.put(timestamp, correlation);
            } else {
                correlations.get(timestamp).addFood(theFood);
            }
        }

        for (Mood mood : theMoodHistory) {
            long timestamp = 1000 * (mood.getTimeAdded() / (60 * 60 * 1000));
            if (correlations.containsKey(timestamp)) {
                Correlation correlation = correlations.get(timestamp);
                correlation.incrementMood(mood);

                if (theFoodToEat == null || correlation.getTotalMood() > theFoodToEat.getTotalMood()) {
                    theFoodToEat = correlation;
                } else if (theFoodToAvoid == null || correlation.getTotalMood() < theFoodToAvoid.getTotalMood()) {
                    theFoodToAvoid = correlation;
                }
            }
        }
    }

    public FoodList getFoodToEat() {
        return theFoodToEat.getFoodList();
    }

    public FoodList getFoodToAvoid() {
        return theFoodToAvoid.getFoodList();
    }

    @Override
    public void showNavigationUI() {
        theAnalyticAppUI.setVisible(true);
    }

    public void showChartUI() {
        ChartUI ui = new ChartUI(this);
        ui.setVisible(true);
    }

    public Chart getFoodChart() {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();
        ArrayList<Color> colors = new ArrayList<>();

        Random rand = new Random();

        ArrayList<Food> foodHistory = getCurrentUser().getFoodHistory().getList();

        for (Food food : foodHistory) {
            if (!labels.contains(food.getName())) {
                labels.add(food.getName());
                values.add(new Double(1));
                colors.add(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
            } else {
                int index = labels.indexOf(food.getName());
                values.set(index, values.get(index) + 1.0);
            }
        }

        for (int i = 0; i < values.size(); i++) {
            values.set(i, (values.get(i) / foodHistory.size()) * 100);
        }

        return new Chart(values, colors, labels);
    }

    public Chart getMoodChart() {
        ArrayList<String> labels = new ArrayList<>();
        labels.add("1");
        labels.add("2");
        labels.add("3");
        labels.add("4");
        labels.add("5");

        ArrayList<Double> values = new ArrayList<>();
        values.add(new Double(0));
        values.add(new Double(0));
        values.add(new Double(0));
        values.add(new Double(0));
        values.add(new Double(0));

        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.MAGENTA);

        ArrayList<Mood> moodHistory = getCurrentUser().getMoodHistory().getList();

        for (Mood mood : moodHistory) {
            values.set(mood.getRating(), values.get(mood.getRating()) + 1.0);
        }

        for (int i = 0; i < values.size(); i++) {
            values.set(i, (values.get(i) / moodHistory.size()) * 100);
            System.out.println((values.get(i) / moodHistory.size()) * 100);
        }

        return new Chart(values, colors, labels);
    }
}
