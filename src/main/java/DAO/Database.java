
package DAO;

import java.util.ArrayList;
import java.util.Locale;

import javax.xml.crypto.Data;

import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;

public class Database {

    ArrayList<Product> productTable;
    ArrayList<Category> categoryTable;
    ArrayList<Accessory> accessoryTable;
    

    public Database() {
        this.productTable = new ArrayList<Product>();
        this.categoryTable = new ArrayList<Category>();
        this.accessoryTable =  new ArrayList<Accessory>();
    }

    public static void insertTable(Database db, Object o) {
        
        if (o instanceof Product) {
            db.productTable.add((Product)o);

        } 
        else if (o instanceof Category) {
            db.categoryTable.add((Category)o);
        } 
        else if (o instanceof Accessory) {
            db.accessoryTable.add((Accessory)o);
        }
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

    public static void updateTable() {
        
    }

    public static void updateTableById(Database db, int id, Object o) {
         if (o instanceof Product) {
            for (Product p : db.productTable) {
                if (p.ID == id) {
                    db.productTable.remove(p);
                    db.productTable.add((Product)o);
                    break;
                }
            }
            

        } 
        else if (o instanceof Category) {
            db.categoryTable.add((Category)o);
            for (Category c : db.categoryTable) {
                if (c.ID == id) {
                    db.categoryTable.remove(c);
                    db.categoryTable.add((Category)o);
                    break;
                }
            }
        } 
        else if (o instanceof Accessory) {
            db.accessoryTable.add((Accessory)o);
            for (Accessory a : db.accessoryTable) {
                if (a.ID == id) {
                    db.accessoryTable.remove(a);
                    db.accessoryTable.add((Accessory)o);
                    break;
                }
            }
        }   
    }

    public static void deleteTable(Database db, int id) {
        for (Product p : db.productTable) {
            if (p.ID == id) {
                db.productTable.remove(p);
                break;
            }
        }
        for (Category c : db.categoryTable) {
            if (c.ID == id) {
                db.categoryTable.remove(c);
                break;
            }
        }
        for (Accessory a : db.accessoryTable) {
            if (a.ID == id) {
                db.accessoryTable.remove(a);
                break;
            }
        }
    }

    public static void truncateTable(Database db) {
        db = null;
    }


}
