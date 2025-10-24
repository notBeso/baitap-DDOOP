package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Product;

public class ProductDAO {
    public static Integer insert(Database db, Product p) {
        int result = 0;
        if (db.insertTable(db, p) == 1) {
            result = 1;
        }
        return result;
    }

    public static Integer update(Database db, String name,Product p) {
        int result = 0;
        if (db.updateTable(db, name, p) == 1) {
            result = 1;
        }
        return result;
    }

    public static boolean  delete(Database db, Product p) {
        return db.deleteTable(db, p.ID);
    }

    public static ArrayList<Product> findAll(Database db) {
        ArrayList<Product> result = db.productTable;
        return result;
    }
    
    public static Product findById(Database db, int id) {
        for (Product p : db.productTable) {
            if (p.ID == id) {
                return p;
            }
        }
        return null;
    }
    
    public static Product findByName(Database db,String name) {
        for (Product p : db.productTable) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null; 
    }
    
    public static ArrayList<Product> search(Database db, String name) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product p : db.productTable) {
            if (p.name.contains(name)) {
                result.add(p);
            }
        }
        return result;
    }



}
