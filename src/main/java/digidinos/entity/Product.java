package digidinos.entity;
public class Product extends BaseRow implements IEntity {
    private int categoryID;

    public Product(int ID, String name, int categoryID) {
        super(ID, name);
        this.categoryID= categoryID;
    }
    public void run(){
        System.out.println( ID + name );
        System.out.println("Product");
    }
}