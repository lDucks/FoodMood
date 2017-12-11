/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.food.Food;
import foodmood.food.FoodHistoryUI;
import foodmood.food.FoodList;
import foodmood.login.LoginController;
import foodmood.mood.Mood;
import foodmood.navigation.NavigationController;
import foodmood.user.User;
import java.util.ArrayList;
import java.util.HashMap;

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
        CorrelationUI theUI = new CorrelationUI(getFoodToEat(), getFoodToAvoid());
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
}
