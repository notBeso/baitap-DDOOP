package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Category;

public class CategoryDAO implements IDAO{
    @Override
    public boolean insert(Object obj) {
        return Database.insertTable("Category", obj)==1;
    }
    @Override
    public Integer update(Object obj) {
        return Database.updateTable("Category", obj);
    }
    @Override
    public boolean delete(Object obj) {
        return Database.deleteTable("Category",((Category)obj).getID());
    }
    @Override
    public ArrayList<Object> findAll() {
        return Database.selectTable("Category");
    }
    @Override
    public Category findById(int id) {
        for (Object obj : findAll()) {
            if (((Category)obj).getID() == id) {
                return (Category)obj;
            }
        }
        return null;
    }
    @Override
    public Category findByName(String name) {
        for (Object obj : findAll()) {
            if (((Category)obj).getName().equals(name)) {
                return (Category)obj;
            }
        }
        return null; 
    }
}