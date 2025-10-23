package digidinos.entity;
public class Product {
    
    public int ID;
    String name;
    int categoryID;

    public Product(int ID, String name, int categoryId ){
        this.name = name;
        // this.ID = ID;
        // this.categoryID = categoryId;
    }

    public static void print(Product p) {
        System.out.print("ID: " +p.ID + "   NAME: " + p.name + "   CATEGORY ID: " + p.categoryID );
    }

    public static void setID(Product p, int ID) {
        p.ID = ID;
    }

    
    public static void remove(Product p) {
        p = null;
    }

}

