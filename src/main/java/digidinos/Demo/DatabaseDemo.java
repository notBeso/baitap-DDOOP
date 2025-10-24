package digidinos.Demo;

import javax.xml.crypto.Data;

import digidinos.DAO.Database;
import digidinos.entity.Category;

public class DatabaseDemo {
    
    public static void insertTableTest(Database db, Object o) {
        if (Database.insertTable(db,o)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }

    public static void selectTableTest(Database db) {
        if(Database.selectTable(db,"Category").isEmpty()){
            System.out.println("No Category Data Found");
        } else {
            System.out.println("Data Category Found");
        }
        if(Database.selectTable(db,"Product").isEmpty()){
            System.out.println("No Product Data Found");
        } else {
            System.out.println("Data Product Found");
        }
        if(Database.selectTable(db,"Accessory").isEmpty()){
            System.out.println("No Accessory Data Found");
        } else {
            System.out.println("Data Accessory Found");
        }
    }

    public static void updateTableTest(Database db, String name, Object o) {
        if (Database.updateTable(db, name, c)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }

    public static void deleteTableTest(Database db, int id) {
        if (Database.deleteTable(db, id)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }

    public static void truncateTableTest(Database db) {
        if (db.categoryTable.isEmpty() && db.productTable.isEmpty() && db.accessoryTable.isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }
    
    public static void initDatabase() {
        
    }   
    
    public static void printTableTest(Database db) {
        db.printTable(db, "Product");
        db.printTable(db, "Category");
        db.printTable(db, "Accessory");
    }


}
