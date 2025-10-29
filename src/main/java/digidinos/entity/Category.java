package digidinos.entity;

public class Category extends BaseRow {
    public Category(int id, String name) {
        super(id, name);
    }   
    @Override
    public String getType() {
        return "Category";
    }
}

