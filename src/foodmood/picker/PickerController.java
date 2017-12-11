/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.picker;

import foodmood.analytics.AnalyticsController;
import foodmood.login.LoginController;
import foodmood.navigation.NavigationController;

/**
 *
 * @author justi
 */
public class PickerController {
    
    private final AppPickerUI theAppPickerUI;
    private final LoginController theLoginController;
    
    /**
     *
     * @param theLoginController
     */
    public PickerController(LoginController theLoginController){
        this.theAppPickerUI = new AppPickerUI(this);
        theAppPickerUI.setVisible(true);
        this.theLoginController = theLoginController;
    }
    
    
    public void pickMobileApp(){
        new NavigationController(theLoginController);
        theAppPickerUI.dispose();
    }
    
    public void pickAnalyticsApp(){
        new AnalyticsController(theLoginController);
        theAppPickerUI.dispose();
    }
    
}
