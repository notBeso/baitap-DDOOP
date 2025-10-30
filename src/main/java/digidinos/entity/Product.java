package digidinos.entity;
public class Product extends BaseRow implements IEntity {
    private int categoryID;

    public Product(int ID, String name, int categoryID) {
        super(ID,name);
        this.categoryID= categoryID;
    }

    /**
     * print obj
     * @param void
     * @return void
     */
    public void print(){
        System.out.println("Product");
        System.out.println( ID + "   " + name+ "   " + categoryID );
    }
}