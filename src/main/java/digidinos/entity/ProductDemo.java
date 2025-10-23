package digidinos.entity;

public class ProductDemo {
    int ID;
    String name;
    int categoryID;

    public ProductDemo(int ID, String name, int categoryId ){
        this.ID = ID;
        this.name = name;
        this.categoryID = categoryId;
    }

    public static void createProductTest(int ID, String name, int categoryId) {
        ProductDemo pd = new ProductDemo(ID, name, categoryId);
    }

    public static void printPoduct(ProductDemo p) {
        System.out.print("ID: " +p.ID + "   NAME: " + p.name + "   CATEGORY ID: " + p.categoryID );
    }

    public static void setID(ProductDemo p, int ID) {
        p.ID = ID;
    }

    
    public static void remove(ProductDemo p) {
        p = null;
    }
}
