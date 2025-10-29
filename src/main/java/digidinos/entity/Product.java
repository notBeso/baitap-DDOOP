package digidinos.entity;
public class Product implements IEntity {
    
    protected int ID;
    private String name;
    private int categoryID;

    public Product(int ID, String name, int categoryID ){
        this.name = name;
        this.ID = ID;
        this.categoryID = categoryID;
    }
    @Override
    public void print(){
        System.out.println("ID: " +ID + "   NAME: " + name + "   categoryID" + categoryID);
    }
    @Override
    public void setID(int id) {
       ID = id;
    }
    @Override
    public Integer getID() {
        return ID;
    }
    @Override
    public String getName() {
        return name;
    }
}

