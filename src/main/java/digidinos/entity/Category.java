package digidinos.entity;

public class Category implements IEntity {
    private int ID;
    private String name;

    public Category(int ID, String name ){
        this.ID = ID;
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("ID: " +ID + "   NAME: " + name);
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

