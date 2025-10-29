package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Product;

public class ProductDAODemo {
    Database database;
    public  void insertTest(Product product){
        // test database insetTable method
        if (database.insertTable("Product",product)==1) {
            System.out.println("Insert Product Successful");
        } else {
            System.out.println("Insert Product Failed");
        }
    }
    public  void selectTest(){
        // test database selectTable method
        if(database.selectTable("Product").isEmpty()){
            System.out.println("No Product Data Found");
        } else {
            System.out.println("Product Data Found");
        }
    }
    public  void updateTest(Product product){
        // test database updateTable method
        if (database.updateTable("Product", product)==1) {
            System.out.println("Update Product Successful");
        } else {
            System.out.println("Update Product Failed");
        }
    }
    public  void updateTableByIdTest(int ID,Product product){
        // test database updateTableById method
        if (database.updateTableById(ID, product)==1) {
            System.out.println("Update Product Table Successful");
        } else {
            System.out.println("Update Product Table Failed");
        }
    }
    public  void deleteTest(Product product){
        // test database deleteTable method
        if (database.deleteTable("Product", product)==true) {
            System.out.println("Delete Product Successful");
        } else {
            System.out.println("Delete Product Failed");
        }
    }
    public  void truncateTest(){
        // test database truncateTable method
        database.truncateTable("Product");
        if(database.selectTable("Product").isEmpty()){
            System.out.println("Truncate Product Successful");
        } else {
            System.out.println("Truncate Product Failed");
        }
    }
}
