package digidinos.DAO;

import digidinos.entity.Accessory;

public class AccessoryDAO extends BaseDAO implements IDAO{
    public AccessoryDAO(Database db) {
        super(db);
    }

    /**
     * find and print object base on input name and id
     * @param String $name
     * @param int $id
     * return void
     */
    public void find(String name,int id){
        System.out.println("find by name");
        try {
            findByName(name).print();
        } catch (NullPointerException e) {
            System.err.println("no found");
        }

        System.out.println("find by id");
        try {
            findById(id).print();
        } catch (NullPointerException e) {
            System.err.println("no found");
        } 
    }

    /**
     * print table
     * @param void
     * @return void
     */
    public void print(){
        for(Object o : db.selectTable("Accessory")){
            ((Accessory)o).print();
        }
        System.out.println("END");
    }
    /**
     * insert new obj to table
     * @param int $id 
     * @return Accessory $accessory
     */
    public Accessory findById(int id) {
        for (Object obj : db.selectTable("Accessory")) {
            if (((Accessory)obj).getID() == id) {
                return (Accessory)obj;
            }
        }
        return null;
    }

     /**
     * insert new obj to table
     * @param String $name
     * @return Accessory $accessory
     */
    public Accessory findByName(String name) {
        for (Object obj : db.selectTable("Accessory")) {
            if (((Accessory)obj).getName().equals(name)) {
                return (Accessory)obj;
            }
        }
        return null; 
    }
    
}
