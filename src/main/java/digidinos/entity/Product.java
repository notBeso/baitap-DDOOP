package digidinos.entity;
public class Product {
    
    public int ID;
    public String name;
    int categoryID;

    public Product(int ID, String name, int categoryId ){
        this.name = name;
        this.ID = ID;
        this.categoryID = categoryId;
    }

    public static void print(Product p) {
        
        System.out.println("ID: " +p.ID + "   NAME: " + p.name + "   CATEGORY ID: " + p.categoryID );
    }

    public static void setID(Product p, int ID) {
        BaseRow.setIDBase(p, ID);
    }
    public static Integer getID(Product p) {
        return BaseRow.getIDBase(p);
    }

}

