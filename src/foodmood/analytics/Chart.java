/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

/**
 *
 * @author justin
 */
public class Chart {

    private Relation relation;
    private Correlation correlation;
    
    /**
     *
     * @param relation
     */
    public Chart(Relation relation){
        this.relation = relation;
        
    }
    
    /**
     *
     * @param correlation
     */
    public Chart(Correlation correlation){
        this.correlation = correlation;
    }
    
    /**
     * Shows the chart UI
     */
    public void showChart(){
        
    }
    
    /**
     * Generates the chart
     */
    public void generate(){
        
    }
    
}
