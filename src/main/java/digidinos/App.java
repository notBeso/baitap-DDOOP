package digidinos;

import digidinos.DAO.AccessoryDAO;
import digidinos.DAO.CategoryDAO;
import digidinos.DAO.Database;
import digidinos.DAO.ProductDAO;
import digidinos.entity.Accessory;
import digidinos.entity.Category;
import digidinos.entity.Product;

public class App 
{
   public static void main(String[] args) {

// add object
      Database db1 = Database.getInstance();

      db1.insertTable("Product",new Product(1,"vsv",1));
      db1.insertTable("Product",new Product(2,"fge",2));
      db1.insertTable("Product",new Product(3,"wrw",1));
      db1.insertTable("Product",new Product(4,"fnbf",2));
      
      db1.insertTable("Category",new Category(1, "say"));
      db1.insertTable("Category",new Category(2, "gex"));

      db1.insertTable("Accessory",new Accessory(23, "dkdk"));
      db1.insertTable("Accessory",new Accessory(56, "beso"));

      System.out.println("database1");
      db1.print();
      System.out.println("END");

// TESTING
      ProductDAO productDAO = new ProductDAO(db1);
      // productDAO.print();
      productDAO.find("wrw", 4);
      System.out.println("END");

      CategoryDAO categoryDAO = new CategoryDAO(db1);
      // categoryDAO.print();
      categoryDAO.find("dg",2);
      System.out.println("END");

      AccessoryDAO accessoryDAO = new AccessoryDAO(db1);
      accessoryDAO.insert("Category", new Product(5,"dgf",3));
      accessoryDAO.insert("Category", new Category(6,"dgf"));
      accessoryDAO.insert("Accessory", new Accessory(7,"dgf"));
      accessoryDAO.print();
   } 
}
