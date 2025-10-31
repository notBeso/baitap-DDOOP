package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Category;

public class CategoryDAODemo {
    Database database;

    /**
     * test database insetTable method
     * @param Category $category
     * @return void 
     */
    public void insertTest(Category category){
        if (database.insertTable("Category",category)==1) {
            System.out.println("Insert Category Successful");
        } else {
            System.out.println("Insert Category Failed");
        }
    }

    /**
     * test database selectTable method
     * @param void
     * @return void
     */
    public void selectTest(){
        if(database.selectTable("Category").isEmpty()){
            System.out.println("No Category Data Found");
        } else {
            System.out.println("Category Data Found");
        }
    }

    /**
     * test database updateTable method
     * @param Category $category
     * @return void
     */
    public void updateTest(Category category){
        if (database.updateTable("Category", category)==1) {
            System.out.println("Update Category Successful");
        } else {
            System.out.println("Update Category Failed");
        }
    }

    /**
     * test database updateTableById method
     * @param int $id, Category $category
     * @return void
     */
    public void updateTableByIdTest(int ID,Category category){
        if (database.updateTableById(ID, category)==1) {
            System.out.println("Update Category Table Successful");
        } else {
            System.out.println("Update Category Table Failed");
        }
    }

    /**
     * test database deleteTable method
     * @param Category $category
     * @return void
     */
    public void deleteTest(Category category){
        if (database.deleteTable("Category", category)==true) {
            System.out.println("Delete Category Successful");
        } else {
            System.out.println("Delete Category Failed");
        }
    }

    /**
     * test database truncateTable method
     * @param void
     * @return void
     */
    public void truncateTest(){
        database.truncateTable("Category");
        if(database.selectTable("Category").isEmpty()){
            System.out.println("Truncate Category Successful");
        } else {
            System.out.println("Truncate Category Failed");
        }
    }

    // public CategoryDAODemo(Database db) {
    //     super(db);
    // }

}