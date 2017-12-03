package foodmood.user;

import foodmood.serialization.SerializedDataController;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public final class UserList {

    public static String STORAGE_FILE_PATH = SerializedDataController.EXTERNAL_DATA_PATH + "users.ser";
    private final ArrayList<User> theListOfUsers;

    public UserList() {
        theListOfUsers = SerializedDataController.getSerializedDataCntl().getUserList();
    }

    public ArrayList<User> getListOfUsers() {
        return theListOfUsers;
    }

    public boolean authenticate(String usernameToCheck, char[] passwordToCheck) {
        for (int i = 0; i < theListOfUsers.size(); i++) {
            boolean nameMatch = usernameToCheck.equals(theListOfUsers.get(i).getUsername());
            boolean passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if (nameMatch && passwordMatch) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String username) {
        return theListOfUsers.stream().anyMatch((theUser) -> (theUser.getUsername().equals(username)));
    }

    public void add(User theUserToAdd) {
        theListOfUsers.add(theUserToAdd);
        SerializedDataController.getSerializedDataCntl().setList(theListOfUsers, STORAGE_FILE_PATH);
    }
}
