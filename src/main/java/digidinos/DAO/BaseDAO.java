package digidinos.DAO;

import java.util.ArrayList;

abstract class BaseDAO {
    protected Database db;

    public BaseDAO (Database db) {
        this.db = db;
    }

    /**
     * insert new obj to table 
     * @param Object $obj
     * @return boolean
     */
    public boolean insert (String name,Object obj){
        return this.db.insertTable(name,obj)==1;
    }

    /**
     * update new obj to existed obj in table 
     * @param Object $obj 
     * @return int
     */
    public Integer update(String name,Object obj) {
        return this.db.updateTable(name,obj);
    }

    /**
     * delete obj with same id in table 
     * @param Object $obj 
     * @return boolean
     */
    public boolean delete(String name,Object obj) {
        return this.db.deleteTable(name,obj);
    }

    /**
     * create a new table with same class
     * @param Object $obj
     * @return arraylist
     */
    public ArrayList<Object> findAll(String name) {
        return this.db.selectTable(name);
    }
}
