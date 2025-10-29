package digidinos.Demo;

import digidinos.DAO.Database;

public class DatabaseDemo {
    public static void insertTableTest(String name, Object obj) {
        // test if insertTable function work correctly
        if (Database.insertTable(name,obj)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }
    public static void selectTableTest(String name) {
        // test if selectTable function work correctly
        if(Database.selectTable(name).isEmpty()){
            System.out.println("No Data Found");
        } else {
            System.out.println("Data Found");
        }
    }
    public static void updateTableTest(String name, Object obj) {
        // test if updateTable function work correctly
        if (Database.updateTable(name,obj)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
    public static void deleteTableTest(String name, Object obj) {
        // test if deleteTable function work correctly
        if (Database.deleteTable(name,obj)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }
    public static void truncateTableTest(String name) {
        // test if truncateTable function work correctly
        Database.truncateTable(name);
        if (Database.selectTable(name).isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }
    public static void initDatabase() {
        
    }
}
