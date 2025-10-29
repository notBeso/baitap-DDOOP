package digidinos.entity;

abstract class BaseRow {
    protected int ID;
    protected String name;
    public BaseRow(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setID(int id) {
        this.ID = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
