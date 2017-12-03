package foodmood.login;

import foodmood.navigation.NavigationController;
import foodmood.notification.NotificationController;
import foodmood.user.User;
import foodmood.user.UserList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gisward
 */
public final class LoginController {

    private final UserList theUserList;
    private final LoginUI theLoginUI;
    private User theCurrentUser;

    public LoginController() {
        this.theUserList = new UserList();
        this.theLoginUI = new LoginUI(this);
        requestLoginUI();
    }

    public User getCurrentUser() {
        return theCurrentUser;
    }

    public void requestLoginUI() {
        theLoginUI.setVisible(true);
    }

    public NavigationController requestNavigationCntl() {
        theLoginUI.dispose();
        return new NavigationController(this);
    }

     public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck) {
        boolean auth = theUserList.authenticate(usernameToCheck, passwordToCheck);

        if (auth) {
             theCurrentUser = new User(usernameToCheck, passwordToCheck);
             NotificationController theNC = new NotificationController(theCurrentUser);
             theNC.checkForFoodNotification();
             theNC.checkForMoodNotification();
        }

        return auth;
    }

    public void requestRegisterUI() {
        theLoginUI.setVisible(false);
        SignUpUI theRegisterUI = new SignUpUI(this);
        theRegisterUI.setVisible(true);
    }

    public boolean registerUser(String username, char[] password) {
        if (theUserList.contains(username)) {
            return false;
        } else {
            theUserList.add(new User(username, password));
            return true;
        }
    }

    public void logout() {
       System.exit(0);
    }
}
