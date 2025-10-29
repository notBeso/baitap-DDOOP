package digidinos.DAO;

import java.util.ArrayList;

import digidinos.entity.Accessory;

public class AccessoryDAO {
    Database database;
    // @Override
    // insert new obj to table 
    // @param Accessory $accessory
    // @return boolean
    public boolean insert(Accessory accessory) {
        return database.insertTable("Accessory", accessory)==1;
    }
    // @Override
    // update new obj to existed obj in table 
    // @param Accessory $accessory
    // @return int
    public Integer update(Accessory accessory) {
        return database.updateTable("Accessory", accessory);
    }
    // @Override
    // delete obj with same id in table 
    // @param Accessory $accessory
    // @return boolean
    public boolean delete(Accessory accessory) {
        return database.deleteTable("Accessory",((Accessory)accessory).getID());
    }
    // @Override
    // create a new table with same class
    // @param Accessory $accessory
    // @return arraylist
    public ArrayList<Object> findAll() {
        return database.selectTable("Accessory");
    }
    // @Override
    // insert new obj to table 
    // @param Accessory $accessory
    // @return boolean
    public Accessory findById(int id) {
        for (Object obj : findAll()) {
            if (((Accessory)obj).getID() == id) {
                return (Accessory)obj;
            }
        }
        return null;
    }
    // @Override
    // insert new obj to table 
    // @param String $name
    // @return Accessory $accessory
    public Accessory findByName(String name) {
        for (Object obj : findAll()) {
            if (((Accessory)obj).getName().equals(name)) {
                return (Accessory)obj;
            }
        }
        return null; 
    }
}
