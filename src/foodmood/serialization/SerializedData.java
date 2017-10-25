package foodmood.serialization;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jxr5398
 */
public class SerializedData implements Serializable {

    private ArrayList listToSave;

    public SerializedData() {
        listToSave = new ArrayList();
    }

    public SerializedData(ArrayList listToSave) {
        this.listToSave = listToSave;
    }

    public ArrayList getList() {
        return listToSave;
    }

    public void setList(ArrayList listToSave) {
        this.listToSave = listToSave;
    }

    public boolean isEmpty() {
        return listToSave.isEmpty();
    }
}