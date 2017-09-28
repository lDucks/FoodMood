/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.notification;

/**
 *
 * @author justin
 */
public class Notification {
    
    private boolean isRead;
    private final String title;
    private final String description;
    
    /**
     * The default constructor
     *
     * @param title
     * @param description
     */
    public Notification(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    /**
     * Returns the title for the notification display.
     * 
     * @return The notification's title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Returns the description to be displayed.
     *
     * @return The notification's description
     */
    public String getDescription(){
        return description;
    }
  
    /**
     * Tells whether or not the notification was read.
     *
     * @return Is read
     */
    public boolean isRead(){
        return isRead;
    }
    
    /**
     * Mark the notification read.
     */
    public void markRead(){
        this.isRead = true;
    }
    
    /**
     * Mark the notification unread
     */
    public void markUnread(){
        this.isRead = false;
    }
}
