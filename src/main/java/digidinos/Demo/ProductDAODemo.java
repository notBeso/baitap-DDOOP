package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.DAO.ProductDAO;
import digidinos.entity.Product;

public class ProductDAODemo {
    private static DatabaseDemo db;

    public static void insertTest(Database db, Product p){
        if (ProductDAO.insert(db,p)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }
    // public static void selectTest(Database db){
    //     if(ProductDAO.select(db,"Product").isEmpty()){
    //         System.out.println("No Data Found");
    //     } else {
    //         System.out.println("Data Found");
    //     }
    // }
    public static void updateTest(Database db, String name, Product p){
        if (ProductDAO.update(db, name, p)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
    public static void deleteTest(Database db, Product p){
        if (ProductDAO.delete(db, p)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }
    public static void truncateTest(Database db){
        if (db.productTable.isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }
}
