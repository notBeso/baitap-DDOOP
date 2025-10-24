
package digidinos.DAO;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;

import javax.xml.crypto.Data;

import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;

public class Database {

    public ArrayList<Product> productTable;
    public ArrayList<Category> categoryTable;
    public ArrayList<Accessory> accessoryTable;
    

    public Database() {
        this.productTable = new ArrayList<Product>();
        this.categoryTable = new ArrayList<Category>();
        this.accessoryTable =  new ArrayList<Accessory>();
    }

    public static Integer insertTable(Database db, Object o) {
        // System.out.println(Database.checkEntity(o));
        // if(Database.checkEntity(o)==false){
        //     return null;
        // }
        int result = 0;
        if (o instanceof Product) {
            db.productTable.add((Product)o);
            result = 1;
        } 
        else if (o instanceof Category) {
            db.categoryTable.add((Category)o);
            result = 1;
        } 
        else if (o instanceof Accessory) {
            db.accessoryTable.add((Accessory)o);
            result = 1;
        }
        return result;
    }

    public static ArrayList<Object> selectTable(Database db, String name) {
        ArrayList<Object> result = new ArrayList<Object>(); 
        if(name.equals(Product.class.getSimpleName())){
            result.addAll(db.productTable);
        }
        else if(name.equals(Category.class.getSimpleName())){
            result.addAll(db.categoryTable);
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            result.addAll(db.accessoryTable);
        }
        return result;
    }

    public static Integer updateTable(Database db, String name, Object o) {
        // if(Database.checkEntity(o)==false){
        //     return null;
        // }
        int result = 0;
        if(name.equals(Product.class.getSimpleName()) ){
            for (Product p : db.productTable) {
                if (p.ID == ((Product)o).ID) {
                    db.productTable.set(db.productTable.indexOf(p),(Product)o);
                    result = 1;
                    break;
                }
            }           
        }
        else if(name.equals(Category.class.getSimpleName())){
            for (Category c : db.categoryTable) {
                if (c.ID == ((Category)o).ID) {
                    db.categoryTable.set(db.categoryTable.indexOf(c),(Category)o);
                    result = 1;
                    break;
                }
            }           
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            for (Accessory a : db.accessoryTable) {
                if (a.ID == ((Accessory)o).ID) {
                    db.accessoryTable.set(db.accessoryTable.indexOf(a),(Accessory)o);
                    result = 1;
                    break;
                }
            }           
        }

        return result;
    }

    public static Integer updateTableById(Database db, int id, Object o) {
        // if(Database.checkEntity(o)==false){
        //     return null;
        // }
        int result = 0;
        if (o instanceof Product) {
            for (Product p : db.productTable) {
                if (p.ID == id) {
                    db.productTable.set(db.productTable.indexOf(p),(Product)o);  
                    result = 1;           
                    break;
                }
            }
        } 
        else if (o instanceof Category) {
            for (Category c : db.categoryTable) {
                if (c.ID == id) {
                    db.categoryTable.set(db.categoryTable.indexOf(c),(Category)o); 
                    result = 1;            
                    break;
                }
            }
        } 
        else if (o instanceof Accessory) {
            for (Accessory a : db.accessoryTable) {
                if (a.ID == id) {
                    db.accessoryTable.set(db.accessoryTable.indexOf(a),(Accessory)o);
                    result = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static Boolean deleteTable(Database db, int id) {
        boolean result = false;
        for (Product p : db.productTable) {
            if (p.ID == id) {
                db.productTable.remove(p);
                result = true;
            }
        }
        for (Category c : db.categoryTable) {
            if (c.ID == id) {
                db.categoryTable.remove(c);
                result = true;
            }
        }
        for (Accessory a : db.accessoryTable) {
            if (a.ID == id) {
                db.accessoryTable.remove(a);
                result = true;
            }
        }
        return result;
    }

    public static void truncateTable(Database db, String name) {
        if(name.equals(Product.class.getSimpleName())){
            db.productTable.clear();
        }
        else if(name.equals(Category.class.getSimpleName())){
            db.categoryTable.clear();
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            db.accessoryTable.clear();
        }
    }

    public static void printTable(Database db, String name) {
        if(name.equals(Product.class.getSimpleName())){
            System.out.println("-----PRODUCT-----");
            for (Product p : db.productTable) {
                Product.print(p);
            }
        }
        else if(name.equals(Category.class.getSimpleName())){
            System.out.println("-----CATEGORY-----");
            for (Category c : db.categoryTable) {
                
                Category.print(c);
            }
        }
        else if(name.equals(Accessory.class.getSimpleName())){
            System.out.println("-----ACCESSORY-----");
            for (Accessory a : db.accessoryTable) {
                Accessory.print(a);
            }
        }
        
    }

//check if object is valid entity from entity folder
//     public static Boolean checkEntity(Object o) {
        
//         URL location = o.getClass().getProtectionDomain().getCodeSource().getLocation();
//         if (location == null) {
//             return false;
//         }
//         String path = location.getPath();
//         if (path.startsWith("file:")) {

//             path = path.substring(5);

//         } else if (path.startsWith("jar:file:")) {
//             int exclamationIndex = path.indexOf("!");
//             if (exclamationIndex != -1) {
//                 path = path.substring(9, exclamationIndex);
//             } else {
//                 return false;
//             }
//         }

//         File parentDir = new File(path).getParentFile(); // src\main\java\digidinos\entity
        
// // Cannot determine parent directory
//         if (parentDir == null) {
//             return false;
//         }

//         File targetFolder = new File(parentDir.getPath());
//         try {
//             return parentDir.getCanonicalPath().startsWith(targetFolder.getCanonicalPath());
//         } catch (java.io.IOException e) {
//             e.printStackTrace();
//             return false;
//         }
        
//     }

}
