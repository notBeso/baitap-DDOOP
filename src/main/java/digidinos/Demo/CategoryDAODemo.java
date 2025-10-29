package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Category;

public class CategoryDAODemo {
    public static void insertTest(Category category){
        // test Database insetTable method
        if (Database.insertTable("Category",category)==1) {
            System.out.println("Insert Category Successful");
        } else {
            System.out.println("Insert Category Failed");
        }
    }
    public static void selectTest(){
        // test Database selectTable method
        if(Database.selectTable("Category").isEmpty()){
            System.out.println("No Category Data Found");
        } else {
            System.out.println("Category Data Found");
        }
    }
    public static void updateTest(Category category){
        // test Database updateTable method
        if (Database.updateTable("Category", category)==1) {
            System.out.println("Update Category Successful");
        } else {
            System.out.println("Update Category Failed");
        }
    }
    public static void updateTableByIdTest(int ID,Category category){
        // test Database updateTableById method
        if (Database.updateTableById(ID, category)==1) {
            System.out.println("Update Category Table Successful");
        } else {
            System.out.println("Update Category Table Failed");
        }
    }
    public static void deleteTest(Category category){
        // test Database deleteTable method
        if (Database.deleteTable("Category", category)==true) {
            System.out.println("Delete Category Successful");
        } else {
            System.out.println("Delete Category Failed");
        }
    }
    public static void truncateTest(){
        // test Database truncateTable method
        Database.truncateTable("Category");
        if(Database.selectTable("Category").isEmpty()){
            System.out.println("Truncate Category Successful");
        } else {
            System.out.println("Truncate Category Failed");
        }
    }
}