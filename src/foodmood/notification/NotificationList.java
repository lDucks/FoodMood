/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.notification;

import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class NotificationList {

    private final ArrayList<Notification> theNotificationList;

    /**
     * The default constructor
     */
    public NotificationList() {
        this.theNotificationList = new ArrayList<>();
    }

    /**
     * Adds a notification to the notification list.
     * 
     * @param theNotificationToAdd The notification to add
     */
    public void addNotification(Notification theNotificationToAdd) {
        theNotificationList.add(theNotificationToAdd);
    }

    /**
     * Removes a notification from the list by index.
     * 
     * @param index The index of the notification to remove
     */
    public void removeNotification(int index) {
        theNotificationList.remove(index);
    }
    
    /**
     * Removes a notification from the list by object.
     * 
     * @param theNotificationToRemove The notification to remove
     */
    public void removeNotification(Notification theNotificationToRemove){
        theNotificationList.remove(theNotificationToRemove);
    }
}
