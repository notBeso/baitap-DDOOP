package digidinos.entity;

public class Category {
    public int ID;
    String name;

    public Category(int ID, String name ){
        this.ID = ID;
        this.name = name;
    }

    public static void print(Category c){
        System.out.println("ID: " +c.ID + "   NAME: " + c.name);
    }

    public static void setID(Category c, int ID) {
        BaseRow.setIDBase(c, ID);
    }

    public static Integer getID(Category c) {
        return BaseRow.getIDBase(c);
    }
}
