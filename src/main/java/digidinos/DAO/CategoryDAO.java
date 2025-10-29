package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Category;

public class CategoryDAO {
    Database database;
    // @Override
    // insert new obj to table 
    // @param Category $category
    // @return boolean
    public boolean insert(Category category) {
        return database.insertTable("Category", category)==1;
    }
    // @Override
    // update new obj to existed obj in table 
    // @param Category $category
    // @return int
    public Integer update(Category category) {
        return database.updateTable("Category", category);
    }
    // @Override
    // delete obj with same id in table 
    // @param Category $category
    // @return boolean
    public boolean delete(Category category) {
        return database.deleteTable("Category",((Category)category).getID());
    }
    // @Override
    // create a new table with same class
    // @param Category $category
    // @return arraylist
    public ArrayList<Object> findAll() {
        return database.selectTable("Category");
    }
    // @Override
    // insert new obj to table 
    // @param Category $category
    // @return boolean
    public Category findById(int id) {
        for (Object obj : findAll()) {
            if (((Category)obj).getID() == id) {
                return (Category)obj;
            }
        }
        return null;
    }
    // @Override
    // insert new obj to table 
    // @param String $name
    // @return Category $category
    public Category findByName(String name) {
        for (Object obj : findAll()) {
            if (((Category)obj).getName().equals(name)) {
                return (Category)obj;
            }
        }
        return null; 
    }
}