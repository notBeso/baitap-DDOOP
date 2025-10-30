
package digidinos.DAO;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;


import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;
public class Database{

    private ArrayList<Product> productTable;
    private ArrayList<Category> categoryTable;
    private ArrayList<Accessory> accessoryTable;
    private static Database database = null; 

    private Database() {
        this.productTable = new ArrayList<Product>();
        this.categoryTable = new ArrayList<Category>();
        this.accessoryTable =  new ArrayList<Accessory>();
    }

    public static synchronized Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

    /**
     * insert new obj to table 
     * @param String $name
     * @param Object $object
     * @return Integer
     */
    public Integer insertTable(String name, Object obj) {
        int result = 0;
        if (obj instanceof Product && name.equals(Product.class.getSimpleName())) {
            productTable.add((Product)obj);
            return 1;
        } 
        if (obj instanceof Category && name.equals(Category.class.getSimpleName())) {
            categoryTable.add((Category)obj);
            return 1;
        } 
        if (obj instanceof Accessory && name.equals(Accessory.class.getSimpleName())) {
            accessoryTable.add((Accessory)obj);
            return 1;
        }
        return result;
    }

    /**
     * return array with same name
     * @param String $name
     * @param Object $object
     * @return Integer
     */
    public ArrayList<Object> selectTable(String name) {
        ArrayList<Object> result = new ArrayList<Object>(); 
        if(name.equals(Product.class.getSimpleName())){
            result.addAll(productTable);
        }
        if(name.equals(Category.class.getSimpleName())){
            result.addAll(categoryTable);
        }
        if(name.equals(Accessory.class.getSimpleName())){
            result.addAll(accessoryTable);
        }
        return result;
    }

    /**
     * update new obj to existed obj in table
     * @param String $name
     * @param Object $obj 
     * @return int
     */
    public Integer updateTable(String name, Object obj) {
        int result = 0;
        if(name.equals(Product.class.getSimpleName()) ){
            for (int index = 0; index < database.productTable.size();index ++) {
                if (database.productTable.get(index).getID() == ((Product)obj).getID()) {
                    database.productTable.set(index,(Product)obj);  
                    result = 1;           
                    break;
                }
            }         
        }
        if(name.equals(Category.class.getSimpleName())){
            for (int index = 0; index < database.categoryTable.size();index ++) {
                if (database.categoryTable.get(index).getID() == ((Category)obj).getID()) {
                    database.categoryTable.set(index,(Category)obj);  
                    result = 1;           
                    break;
                }
            }          
        }
        if(name.equals(Accessory.class.getSimpleName())){
            for (int index = 0; index < database.accessoryTable.size();index ++) {
                if (database.accessoryTable.get(index).getID() == ((Accessory)obj).getID()) {
                    database.accessoryTable.set(index,(Accessory)obj);  
                    result = 1;           
                    break;
                }
            }
        }
        return result;
    }

    /**
     * update new obj to existed obj with same ID in table
     * @param int $id
     * @param Object $obj 
     * @return Integer
     */
    public Integer updateTableById(int id, Object obj) {
        int result = 0;
        if (obj instanceof Product) {
            for (int index = 0; index < database.productTable.size();index ++) {
                if (database.productTable.get(index).getID() == id) {
                    database.productTable.set(index,(Product)obj);  
                    result = 1;           
                    break;
                }
            }
        } 
        if (obj instanceof Category) {
            for (int index = 0; index < database.categoryTable.size();index ++) {
                if (database.categoryTable.get(index).getID() == id) {
                    database.categoryTable.set(index,(Category)obj);  
                    result = 1;           
                    break;
                }
            }
        } 
        if (obj instanceof Accessory) {
            for (int index = 0; index < database.accessoryTable.size();index ++) {
                if (database.accessoryTable.get(index).getID() == id) {
                    database.accessoryTable.set(index,(Accessory)obj);  
                    result = 1;           
                    break;
                }
            }
        }
        return result;
    }

    /**
     * delete obj with same id in table
     * @param String $name
     * @param Object $obj 
     * @return boolean
     */
    public Boolean deleteTable(String name, Object obj) {
        boolean result = false;
        if(name.equals(Product.class.getSimpleName()) ){
            for (Product product : database.productTable) {
            if (product.getID() == ((Product)obj).getID()) {
                database.productTable.remove(product);
                result = true;
            }
        }          
        }
        if(name.equals(Category.class.getSimpleName())){
            for (Category category : database.categoryTable) {
                if (category.getID() == ((Category)obj).getID()) {
                    database.categoryTable.remove(category);
                    result = true;
                }
            }         
        }
        if(name.equals(Accessory.class.getSimpleName())){
            for (Accessory accessory : database.accessoryTable) {
                if (accessory.getID() == ((Accessory)obj).getID()) {
                    database.accessoryTable.remove(accessory);
                    result = true;
                }
            }           
        }
        return result;
    }

    /**
     * clear the array with same input name
     * @param String $name 
     * @return void
     */
    public void truncateTable(String name) {
        if(name.equals(Product.class.getSimpleName())){
            database.productTable.clear();
        }
        if(name.equals(Category.class.getSimpleName())){
            database.categoryTable.clear();
        }
        if(name.equals(Accessory.class.getSimpleName())){
            database.accessoryTable.clear();
        }
    }

    /**
     * check if the input object is a valid object from entity folder
     * @param Object $obj 
     * @return boolean
     */
    public Boolean checkFromEntityFolder(Object obj) {
        Class<?> objClass = obj.getClass();
        Package objPackage = objClass.getPackage();
        String packageName = objPackage.getName();
        return packageName.equals("digidinos.entity");
    }

}
