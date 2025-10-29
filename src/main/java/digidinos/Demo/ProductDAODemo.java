package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Product;

public class ProductDAODemo {
    public static void insertTest(Product product){
        // test Database insetTable method
        if (Database.insertTable("Product",product)==1) {
            System.out.println("Insert Product Successful");
        } else {
            System.out.println("Insert Product Failed");
        }
    }
    public static void selectTest(){
        // test Database selectTable method
        if(Database.selectTable("Product").isEmpty()){
            System.out.println("No Product Data Found");
        } else {
            System.out.println("Product Data Found");
        }
    }
    public static void updateTest(Product product){
        // test Database updateTable method
        if (Database.updateTable("Product", product)==1) {
            System.out.println("Update Product Successful");
        } else {
            System.out.println("Update Product Failed");
        }
    }
    public static void updateTableByIdTest(int ID,Product product){
        // test Database updateTableById method
        if (Database.updateTableById(ID, product)==1) {
            System.out.println("Update Product Table Successful");
        } else {
            System.out.println("Update Product Table Failed");
        }
    }
    public static void deleteTest(Product product){
        // test Database deleteTable method
        if (Database.deleteTable("Product", product)==true) {
            System.out.println("Delete Product Successful");
        } else {
            System.out.println("Delete Product Failed");
        }
    }
    public static void truncateTest(){
        // test Database truncateTable method
        Database.truncateTable("Product");
        if(Database.selectTable("Product").isEmpty()){
            System.out.println("Truncate Product Successful");
        } else {
            System.out.println("Truncate Product Failed");
        }
    }
}
