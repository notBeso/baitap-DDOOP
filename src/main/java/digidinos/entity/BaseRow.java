package digidinos.entity;

public class BaseRow {
    public static void setIDBase(Object obj, int ID) {
        if (obj instanceof Product) {
            ((Product) obj).ID = ID;
        }
        else if (obj instanceof Category) {
            ((Category) obj).ID = ID;
        }
        else if (obj instanceof Accessory) {
            ((Accessory) obj).ID = ID;
        }
        return;
    }
    public static Integer getIDBase(Object obj) {
        int result = -1;
        if (obj instanceof Product) {
            result = ((Product) obj).ID;
        }
        else if (obj instanceof Category) {
            result = ((Category) obj).ID;
        }
        else if (obj instanceof Accessory) {
            result = ((Accessory) obj).ID;
        }
        return result;
    }
}
