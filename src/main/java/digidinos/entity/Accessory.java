package digidinos.entity;

public class Accessory extends BaseRow implements IEntity {
    public Accessory(int ID, String name) {
        super(ID, name);
    }

    /**
     * print obj
     * @param void
     * @return void
     */
    public void print(){
        System.out.println("Accessory");
        System.out.println( ID+ "   " + name );
        
    }
}