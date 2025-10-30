package digidinos.entity;

abstract class BaseRow {
    protected int ID;
    protected String name;
    public BaseRow(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    /**
     * get object ID
     * @param void
     * @return int
     */
    public int getID() {
        return ID;
    }
    
    /**
     * get object name
     * @param void
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /**
     * change object ID
     * @param int $id
     * @return void
     */
    public void setID(int id) {
        this.ID = id;
    }
    
    /**
     * change object name
     * @param String $name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
