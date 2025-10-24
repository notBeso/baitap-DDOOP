package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Category;

public class CategoryDAO {
    private Category category;
    
    public static Integer insert(Database db, Category c) {
        int result = 0;
        if (db.insertTable(db, c) == 1) {
            result = 1;
        }
        return result;
    }

    public static Integer update(Database db, String name,Category c) {
        int result = 0;
        if (db.updateTable(db, name, c) == 1) {
            result = 1;
        }
        return result;
    }

    public static boolean delete(Database db, Category c) {
        return db.deleteTable(db, c.ID);
    }

    public static ArrayList<Category> findAll(Database db) {
        ArrayList<Category> result = db.categoryTable;
        return result;
    }

    public static Category findById(Database db, int id) {
        for (Category c : db.categoryTable) {
            if (c.ID == id) {
                return c;
            }
        }
        return null;
    }

}