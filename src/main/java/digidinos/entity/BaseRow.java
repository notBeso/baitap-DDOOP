package digidinos.entity;

abstract class BaseRow {
    protected int ID;
    protected String name;
    public BaseRow(int id, String name) {
        this.ID = id;
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
    public abstract String getType();
}
