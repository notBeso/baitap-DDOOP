package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Product;

public class ProductDAO {
    Database database;
    // @Override
    // insert new obj to table 
    // @param Product $product
    // @return boolean
    public boolean insert(Product product) {
        return database.insertTable("Product", product)==1;
    }
    // @Override
    // update new obj to existed obj in table 
    // @param Product $product
    // @return int
    public Integer update(Product product) {
        return database.updateTable("Product", product);
    }
    // @Override
    // delete obj with same id in table 
    // @param Product $product
    // @return boolean
    public boolean delete(Product product) {
        return database.deleteTable("Product",((Product)product).getID());
    }
    // @Override
    // create a new table with same class
    // @param Product $product
    // @return arraylist
    public ArrayList<Object> findAll() {
        return database.selectTable("Product");
    }
    // @Override
    // insert new obj to table 
    // @param Product $product
    // @return boolean
    public Product findById(int id) {
        for (Object obj : findAll()) {
            if (((Product)obj).getID() == id) {
                return (Product)obj;
            }
        }
        return null;
    }
    // @Override
    // insert new obj to table 
    // @param String $name
    // @return Product $product
    public Product findByName(String name) {
        for (Object obj : findAll()) {
            if (((Product)obj).getName().equals(name)) {
                return (Product)obj;
            }
        }
        return null; 
    }
}
