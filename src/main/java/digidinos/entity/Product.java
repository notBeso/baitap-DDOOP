package digidinos.entity;
public class Product extends BaseRow {
    private int categorID;

    public Product(int id, String name, int categoryID) {
        super(id, name);
        this.categorID= categoryID;
    }
    @Override
    public String getType() {
        return "Product";
    }
}

