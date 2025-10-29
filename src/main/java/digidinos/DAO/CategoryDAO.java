package digidinos.DAO;

import digidinos.entity.Category;

public class CategoryDAO extends BaseDAO{
    public CategoryDAO(Database db) {
        super(db);
    }  
    // // Database database;
    // // @Override
    // // insert new obj to table 
    // // @param Category $category
    // // @return boolean
    // public boolean insert(Category category) {
    //     return db.insertTable("Category", category)==1;
    // }
    // // @Override
    // // update new obj to existed obj in table 
    // // @param Category $category
    // // @return int
    // public Integer update(Category category) {
    //     return db.updateTable("Category", category);
    // }
    // // @Override
    // // delete obj with same id in table 
    // // @param Category $category
    // // @return boolean
    // public boolean delete(Category category) {
    //     return db.deleteTable("Category",((Category)category).getID());
    // }
    // // @Override
    // // create a new table with same class
    // // @param Category $category
    // // @return arraylist
    // public ArrayList<Object> findAll() {
    //     return db.selectTable("Category");
    // }
    // // @Override
    // // insert new obj to table 
    // // @param Category $category
    // // @return boolean
    public Category findById(int id) {
        for (Object obj : db.selectTable("Category")) {
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
        for (Object obj : db.selectTable("Category")) {
            if (((Category)obj).getName().equals(name)) {
                return (Category)obj;
            }
        }
        return null; 
    }
}