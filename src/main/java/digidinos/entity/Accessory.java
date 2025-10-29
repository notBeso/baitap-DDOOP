package digidinos.entity;

public class Accessory extends BaseRow {
    public Accessory(int id, String name) {
        super(id, name);
    }   
    @Override
    public String getType() {
        return "Category";
    }
}
