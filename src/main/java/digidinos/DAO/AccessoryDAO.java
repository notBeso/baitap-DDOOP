package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Accessory;
import digidinos.entity.Product;

public class AccessoryDAO implements IDAO {
    @Override
    public boolean insert(Object obj) {
        return Database.insertTable("Accessory", obj)==1;
    }
    @Override
    public Integer update(Object obj) {
        return Database.updateTable("Accessory", obj);
    }
    @Override
    public boolean delete(Object obj) {
        return Database.deleteTable("Accessory",((Product)obj).getID());
    }
    @Override
    public ArrayList<Object> findAll() {
        return Database.selectTable("Accessory");
    }
    @Override
    public Accessory findById(int id) {
        for (Object obj : findAll()) {
            if (((Accessory)obj).getID() == id) {
                return (Accessory)obj;
            }
        }
        return null;
    }
    @Override
    public Accessory findByName(String name) {
        for (Object obj : findAll()) {
            if (((Accessory)obj).getName().equals(name)) {
                return (Accessory)obj;
            }
        }
        return null; 
    }
}
