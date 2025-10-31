package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Product;

public class ProductDAODemo {
    Database database;
    
    /** 
     *  test database insetTable method
     *  @param Product $product
     *  @return void
     */
    public  void insertTest(Product product){
        if (database.insertTable("Product",product)==1) {
            System.out.println("Insert Product Successful");
        } else {
            System.out.println("Insert Product Failed");
        }
    }

    /**
     *  test database selectTable method
     *  @param void
     *  @return void
     */
    public  void selectTest(){
        if(database.selectTable("Product").isEmpty()){
            System.out.println("No Product Data Found");
        } else {
            System.out.println("Product Data Found");
        }
    }
    
    /**
     * test database updateTable method 
     * @param Product $product 
     * @return void
     */
    public  void updateTest(Product product){
        if (database.updateTable("Product", product)==1) {
            System.out.println("Update Product Successful");
        } else {
            System.out.println("Update Product Failed");
        }
    }

    /**
     * test database updateTableById method
     * @param int $id, Product $product 
     * @return void
     */
    public  void updateTableByIdTest(int ID,Product product){
        if (database.updateTableById(ID, product)==1) {
            System.out.println("Update Product Table Successful");
        } else {
            System.out.println("Update Product Table Failed");
        }
    }

    /**
     * test database deleteTable method
     * @param Product $product 
     * @return void
     */
    public  void deleteTest(Product product){
        if (database.deleteTable("Product", product)==true) {
            System.out.println("Delete Product Successful");
        } else {
            System.out.println("Delete Product Failed");
        }
    }

    /**
     * test database truncateTable method
     * @param void 
     * @return void
     */
     public  void truncateTest(){
        database.truncateTable("Product");
        if(database.selectTable("Product").isEmpty()){
            System.out.println("Truncate Product Successful");
        } else {
            System.out.println("Truncate Product Failed");
        }
    }

    // public ProductDAODemo(Database db) {
    //     super(db);
    // }
}
