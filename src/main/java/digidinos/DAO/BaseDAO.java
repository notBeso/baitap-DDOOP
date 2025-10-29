package digidinos.DAO;

import java.util.ArrayList;

abstract class BaseDAO {
    protected Database db;
    public BaseDAO (Database db) {
        this.db = db;
    }

    public boolean insert (String name,Object obj){
        return this.db.insertTable(name,obj)==1;
    }

    public Integer update(String name,Object obj) {
        return this.db.updateTable(name,obj);
    }

    public boolean delete(String name,Object obj) {
        return this.db.deleteTable(name,obj);
    }
    
    public ArrayList<Object> findAll(String name) {
        return this.db.selectTable(name);
    }
}
