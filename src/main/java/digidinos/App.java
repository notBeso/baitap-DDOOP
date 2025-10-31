package digidinos;

import digidinos.DAO.AccessoryDAO;
import digidinos.DAO.CategoryDAO;
import digidinos.DAO.Database;
import digidinos.DAO.ProductDAO;
import digidinos.Demo.AccessoryDAODemo;
import digidinos.Demo.CategoryDAODemo;
import digidinos.Demo.DatabaseDemo;
import digidinos.Demo.ProductDAODemo;
import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;

public class App 
{
   public static void main(String[] args) {

// add object
      Database db1 = Database.getInstance();
      Database db2 = Database.getInstance();
      db2.insertTable("Product",new Product(1,"vsv",1));
      db1.insertTable("Product",new Product(2,"fge",1));
      db2.insertTable("Product",new Product(3,"wrw",1));
      db2.insertTable("Product",new Product(4,"fnbf",2));
      
      db2.insertTable("Category",new Category(1, "say"));
      db2.insertTable("Category",new Category(2, "gex"));

      db1.insertTable("Accessory",new Accessory(23, "dkdk"));
      db1.insertTable("Accessory",new Accessory(56, "beso"));

      System.out.println("database1");
      db1.print();
      System.out.println("END");
      System.out.println("database2");
      db2.print();
      System.out.println("END");

// TESTING
      ProductDAO productDAO = new ProductDAO(db1);
      // productDAO.print();
      productDAO.find("wrw", 1);
      System.out.println("END");

      CategoryDAO categoryDAO = new CategoryDAO(db2);
      // categoryDAO.print();
      categoryDAO.find("dg",2);
      System.out.println("END");

      AccessoryDAO accessoryDAO = new AccessoryDAO(db2);
      accessoryDAO.insert("Category", new Product(5,"dgf",3));
      accessoryDAO.insert("Category", new Category(6,"dgf"));
      accessoryDAO.insert("Accessory", new Accessory(7,"dgf"));
      accessoryDAO.print();

      DatabaseDemo dbd = new DatabaseDemo(db1);
      dbd.insertTableTest("Product", new Product(11,"fvfv",3));
      productDAO.print();

   } 
}
