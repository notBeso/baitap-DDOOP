package digidinos.entity;

import java.util.ArrayList;

import digidinos.DAO.Database;
import digidinos.DAO.IDAO;

public class ProductDemo implements IDAO {
    @Override
    public boolean insert(Object obj) {
        return Database.insertTable("Product", obj)==1;
    }
    @Override
    public Integer update(Object obj) {
        return Database.updateTable("Product", obj);
    }
    @Override
    public boolean delete(Object obj) {
        return Database.deleteTable("Product",((Product)obj).getID());
    }
    @Override
    public ArrayList<Object> findAll() {
        return Database.selectTable("Product");
    }
    @Override
    public Product findById(int id) {
        for (Object obj : findAll()) {
            if (((Product)obj).getID() == id) {
                return (Product)obj;
            }
        }
        return null;
    }
    @Override
    public Product findByName(String name) {
        for (Object obj : findAll()) {
            if (((Product)obj).getName().equals(name)) {
                return (Product)obj;
            }
        }
        return null; 
    }
}
