package digidinos.DAO;

import digidinos.entity.Category;

public class CategoryDAO extends BaseDAO implements IDAO{
    public CategoryDAO(Database db) {
        super(db);
    }

    /**
     * find and print object base on input name and id
     * @param String $name
     * @param int $id
     * return void
     */
    public void find(String name,int id){
        System.out.println("find by name");
        try {
            findByName(name).print();
        } catch (NullPointerException e) {
            System.err.println("no found");
        }

        System.out.println("find by id");
        try {
            findById(id).print();
        } catch (NullPointerException e) {
            System.err.println("no found");
        } 
    }

    /**
     * print table
     * @param void
     * @return void
     */
    public void print(){
        for(Object o : db.selectTable("Category")){
            ((Category)o).print();
        }
        System.out.println("END");
    }
    /**
     * insert new obj to table 
     * @param Category $category
     * @return boolean
     */
    public Category findById(int id) {
        for (Object obj : db.selectTable("Category")) {
            if (((Category)obj).getID() == id) {
                return (Category)obj;
            }
        }
        return null;
    }

    /**
     * insert new obj to table 
     * @param String $name
     * @return Category $category
     */
    public Category findByName(String name) {
        for (Object obj : db.selectTable("Category")) {
            if (((Category)obj).getName().equals(name)) {
                return (Category)obj;
            }
        }
        return null; 
    }
}