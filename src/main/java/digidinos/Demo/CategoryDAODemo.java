package digidinos.Demo;

import digidinos.DAO.CategoryDAO;
import digidinos.DAO.Database;
import digidinos.entity.Category;

public class CategoryDAODemo {
    private static DatabaseDemo db;

    public static void insertTest(Database db, Category c){
        if (CategoryDAO.insert(db,c)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }
    // public static void selectTest(Database db){
    //     if(CategoryDAO.select(db,"Category").isEmpty()){
    //         System.out.println("No Data Found");
    //     } else {
    //         System.out.println("Data Found");
    //     }
    // }
    public static void updateTest(Database db, String name, Category c){
        if (CategoryDAO.update(db, name, c)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
    public static void deleteTest(Database db, Category c){
        if (CategoryDAO.delete(db, c)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }
    public static void truncatetest(Database db){
        if (db.categoryTable.isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }   
}