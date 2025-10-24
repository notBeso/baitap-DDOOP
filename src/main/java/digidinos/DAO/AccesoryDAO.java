package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Accessory;
import digidinos.entity.Product;

public class AccesoryDAO {
    public static Integer insert(Database db,Accessory a) {
        int result = 0;
        if (db.insertTable(db,a) == 1) {
            result = 1;
        }
        return result;
    }

    public static Integer update(Database db, String name,Accessory a) {
        int result = 0;
        if (db.updateTable(db, name, a) == 1) {
            result = 1;
        }
        return result;
    }

    public static boolean  delete(Database db,Accessory a) {
        return db.deleteTable(db, a.ID);
    }

    public static ArrayList<Accessory> findAll(Database db) {
        ArrayList<Accessory> result = db.accessoryTable;
        return result;
    }
    
    public static Accessory findById(Database db,int id) {
        for (Accessory a : db.accessoryTable) {
            if (a.ID == id) {
                return a;
            }
        }
        return null;
        
    }
    
    public static Accessory findByName(Database db,String name) {
        for (Accessory a : db.accessoryTable) {
            if (a.name.equals(name)) {
                return a;
            }
        }
        return null; 
    }
    
    public static ArrayList<Accessory> search(Database db, String name) {
        ArrayList<Accessory> result = new ArrayList<Accessory>();
        for (Accessory a : db.accessoryTable) {
            if (a.name.contains(name)) {
                result.add(a);
            }
        }
        return result;
    }
    
}
