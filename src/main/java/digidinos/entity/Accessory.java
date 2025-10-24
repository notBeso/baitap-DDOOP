package digidinos.entity;

public class Accessory {
    public int ID;
    public String name;

    public Accessory(int ID, String name ){
        this.ID = ID;
        this.name = name;
    }

    public static void print(Accessory a){
        System.out.println("ID: " +a.ID + "   NAME: " + a.name);
    }

    public static void setID(Accessory a, int ID) {
        BaseRow.setIDBase(a, ID);
    }
    public static Integer getID(Accessory a) {
        return BaseRow.getIDBase(a);
    }
}
