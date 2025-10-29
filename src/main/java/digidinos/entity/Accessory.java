package digidinos.entity;

public class Accessory extends BaseRow implements IEntity {
    public Accessory(int ID, String name) {
        super(ID, name);
    }   
    public void run(){
        System.out.println( ID + name );
        System.out.println("Accessory");
    }
}
