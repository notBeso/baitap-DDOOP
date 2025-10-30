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
      Database db2 = Database.getInstance();
      db1.insertTable("Product",new Product(1,"vsv",1));
      db1.insertTable("Product",new Product(2,"fge",2));
      db2.insertTable("Product",new Product(3,"wrw",1));
      db2.insertTable("Product",new Product(4,"fnbf",2));
      
      db1.insertTable("Category",new Category(1, "say"));
      db1.insertTable("Category",new Category(2, "gex"));

      db2.insertTable("Accessory",new Accessory(23, "dkdk"));
      db2.insertTable("Accessory",new Accessory(56, "beso"));

      ProductDAO productDAO = new ProductDAO(db1);
      productDAO.print();
      productDAO.find("wrw", 4);

      CategoryDAO categoryDAO = new CategoryDAO(db2);
      categoryDAO.print();
      categoryDAO.find("dg",2);

      AccessoryDAO accessoryDAO = new AccessoryDAO(db1);
      accessoryDAO.print();
      accessoryDAO.insert("Category", new Product(5,"dgf",3));
   } 
}
