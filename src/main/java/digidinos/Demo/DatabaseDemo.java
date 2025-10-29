package digidinos.Demo;

import digidinos.DAO.Database;

public class DatabaseDemo {
    Database database;
    public  void insertTableTest(String name, Object obj) {
        // test if insertTable function work correctly
        if (database.insertTable(name,obj)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }
    public  void selectTableTest(String name) {
        // test if selectTable function work correctly
        if(database.selectTable(name).isEmpty()){
            System.out.println("No Data Found");
        } else {
            System.out.println("Data Found");
        }
    }
    public  void updateTableTest(String name, Object obj) {
        // test if updateTable function work correctly
        if (database.updateTable(name,obj)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
    public  void deleteTableTest(String name, Object obj) {
        // test if deleteTable function work correctly
        if (database.deleteTable(name,obj)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }
    public  void truncateTableTest(String name) {
        // test if truncateTable function work correctly
        database.truncateTable(name);
        if (database.selectTable(name).isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }
    public  void initdatabase() {
        
    }
}
