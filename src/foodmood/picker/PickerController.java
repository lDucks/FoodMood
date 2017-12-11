/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.picker;

import foodmood.analytics.AnalyticsController;
import foodmood.login.LoginController;

/**
 *
 * @author justi
 */
public class PickerController {
    
    private final AppPickerUI theAppPickerUI;
    
    public PickerController(){
        this.theAppPickerUI = new AppPickerUI(this);
        theAppPickerUI.setVisible(true);
    }
    
    
    public void pickMobileApp(){
        new LoginController();
        theAppPickerUI.dispose();
    }
    
    public void pickAnalyticsApp(){
        new AnalyticsController();
        theAppPickerUI.dispose();
    }
    
}
