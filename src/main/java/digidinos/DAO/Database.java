
package digidinos.DAO;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;

import javax.xml.crypto.Data;

import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;
public class Database{
    private static ArrayList<Product> productTable;
    private static ArrayList<Category> categoryTable;
    private static ArrayList<Accessory> accessoryTable;
    private static Database database; 
    public Database() {
        productTable = new ArrayList<Product>();
        categoryTable = new ArrayList<Category>();
        accessoryTable =  new ArrayList<Accessory>();
        database = new Database();
    }
    public static Integer insertTable(String name, Object obj) {
        /*
         * add new object into the array with same input name
         */
        int result = 0;
        if (obj instanceof Product && name.equals(Product.class.getSimpleName())) {
            database.productTable.add((Product)obj);
            result = 1;
        } 
        else if (obj instanceof Category && name.equals(Category.class.getSimpleName())) {
            database.categoryTable.add((Category)obj);
            result = 1;
        } 
        else if (obj instanceof Accessory && name.equals(Accessory.class.getSimpleName())) {
            database.accessoryTable.add((Accessory)obj);
            result = 1;
        }
        return result;
    }
    public static ArrayList<Object> selectTable(String name) {
        /*
         * return array with same name
         */
        ArrayList<Object> result = new ArrayList<Object>(); 
        if(name.equals(Product.class.getSimpleName())){
            result.addAll(database.productTable);
        }
        else if(name.equals(Category.class.getSimpleName())){
            result.addAll(database.categoryTable);
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            result.addAll(database.accessoryTable);
        }
        return result;
    }
    public static Integer updateTable(String name, Object obj) {
        /**
         * get array base on input name
         * find object with same id
         * replace with new object
         */
        int result = 0;
        if(name.equals(Product.class.getSimpleName()) ){
            for (Product product : database.productTable) {
                if (product.getID() == ((Product)obj).getID()) {
                    database.productTable.set(database.productTable.indexOf(product),(Product)obj);
                    result = 1;
                    break;
                }
            }           
        }
        else if(name.equals(Category.class.getSimpleName())){
            for (Category category : database.categoryTable) {
                if (category.getID() == ((Category)o).getID()) {
                    database.categoryTable.set(database.categoryTable.indexOf(category),(Category)obj);
                    result = 1;
                    break;
                }
            }           
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            for (Accessory accessory : database.accessoryTable) {
                if (accessory.getID() == ((Accessory)o).getID()) {
                    database.accessoryTable.set(database.accessoryTable.indexOf(accessory),(Accessory)obj);
                    result = 1;
                    break;
                }
            }           
        }
        return result;
    }
    public static Integer updateTableById(int id, Object obj) {
        /*
         * check for object with the same id as input id
         * replace that object with input object
         */
        int result = 0;
        if (obj instanceof Product) {
            for (Product product : database.productTable) {
                if (product.getID() == id) {
                    database.productTable.set(database.productTable.indexOf(product),(Product)obj);  
                    result = 1;           
                    break;
                }
            }
        } 
        else if (obj instanceof Category) {
            for (Category category : database.categoryTable) {
                if (category.getID() == id) {
                    database.categoryTable.set(database.categoryTable.indexOf(category),(Category)obj); 
                    result = 1;            
                    break;
                }
            }
        } 
        else if (obj instanceof Accessory) {
            for (Accessory accessory : database.accessoryTable) {
                if (accessory.getID() == id) {
                    database.accessoryTable.set(database.accessoryTable.indexOf(accessory),(Accessory)obj);
                    result = 1;
                    break;
                }
            }
        }
        return result;
    }
    public static Boolean deleteTable(String name, Object obj) {
        /*
         * get array with same input name
         * check for ID of input object in the array
         * remove that object
         */
        boolean result = false;
        for (Product product : database.productTable) {
            if (product.getID() == ((Product)obj).getID()) {
                database.productTable.remove(product);
                result = true;
            }
        }
        for (Category category : database.categoryTable) {
            if (category.getID() == ((Category)obj).getID()) {
                database.categoryTable.remove(category);
                result = true;
            }
        }
        for (Accessory accessory : database.accessoryTable) {
            if (accessory.getID() == ((Accessory)obj).getID()) {
                database.accessoryTable.remove(accessory);
                result = true;
            }
        }
        return result;
    }
    public static void truncateTable(String name) {
        /*
         * clear the array with same input name
         */
        if(name.equals(Product.class.getSimpleName())){
            database.productTable.clear();
        }
        else if(name.equals(Category.class.getSimpleName())){
            database.categoryTable.clear();
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            database.accessoryTable.clear();
        }
    }
    public Boolean checkFromEntityFolder(Object obj) {
        /*
         * check if the input object is a valid object from entity folder
         */
        Class<?> objClass = obj.getClass();
        Package objPackage = objClass.getPackage();
        String packageName = objPackage.getName();
        //TESTING
        //System.out.println( objClass.getName() + "   Package Name: " + packageName);
        return packageName.equals("digidinos.entity");
    }

}
