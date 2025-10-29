package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Category;

public class CategoryDAODemo {
    Database database;
    public void insertTest(Category category){
        // test database insetTable method
        if (database.insertTable("Category",category)==1) {
            System.out.println("Insert Category Successful");
        } else {
            System.out.println("Insert Category Failed");
        }
    }
    public void selectTest(){
        // test database selectTable method
        if(database.selectTable("Category").isEmpty()){
            System.out.println("No Category Data Found");
        } else {
            System.out.println("Category Data Found");
        }
    }
    public void updateTest(Category category){
        // test database updateTable method
        if (database.updateTable("Category", category)==1) {
            System.out.println("Update Category Successful");
        } else {
            System.out.println("Update Category Failed");
        }
    }
    public void updateTableByIdTest(int ID,Category category){
        // test database updateTableById method
        if (database.updateTableById(ID, category)==1) {
            System.out.println("Update Category Table Successful");
        } else {
            System.out.println("Update Category Table Failed");
        }
    }
    public void deleteTest(Category category){
        // test database deleteTable method
        if (database.deleteTable("Category", category)==true) {
            System.out.println("Delete Category Successful");
        } else {
            System.out.println("Delete Category Failed");
        }
    }
    public void truncateTest(){
        // test database truncateTable method
        database.truncateTable("Category");
        if(database.selectTable("Category").isEmpty()){
            System.out.println("Truncate Category Successful");
        } else {
            System.out.println("Truncate Category Failed");
        }
    }
}