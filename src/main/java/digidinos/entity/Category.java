package digidinos.entity;

public class Category extends BaseRow implements IEntity {
    public Category(int ID, String name) {
        super(ID, name);
    }   
    
    public void run(){
        System.out.println( ID + name );
        System.out.println("Category");
    }

}

