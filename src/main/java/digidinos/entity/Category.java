package digidinos.entity;

public class Category extends BaseRow implements IEntity {
    public Category(int ID, String name) {
        super(ID, name);
    }   
    
    /**
     * print obj
     * @param void
     * @return void
     */
    public void print(){
        System.out.print("Category:   ");
        System.out.println( ID + "   " + name );
    }

}

