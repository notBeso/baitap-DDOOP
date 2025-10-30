package digidinos.DAO;

import digidinos.entity.Product;

public class ProductDAO extends BaseDAO implements IDAO{
    public ProductDAO(Database db) {
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
        for(Object o : db.selectTable("Product")){
            ((Product)o).print();
        }
    }
    /**
     * insert new obj to table 
     * @param Product $product
     * @return boolean
     */
    public Product findById(int id) {
        for (Object obj : db.selectTable("Product")) {
            if (((Product)obj).getID() == id) {
                return (Product)obj;
            }
        }
        return null;
    }
    
    /**
     * insert new obj to table
     * @param String $name
     * @return Product $product
     */
    public Product findByName(String name) {
        for (Object obj :  db.selectTable("Product")) {
            if (((Product)obj).getName().equals(name)) {
                return (Product)obj;
            }
        }
        return null; 
    }
}
