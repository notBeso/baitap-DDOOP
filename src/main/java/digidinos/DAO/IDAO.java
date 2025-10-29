package digidinos.DAO;

import java.util.ArrayList;

public interface IDAO {
    boolean insert(Object obj);
    Integer update(Object obj);
    boolean delete(Object obj);
    ArrayList<Object> findAll();
    Object findById(int id);
    Object findByName(String name);
}
