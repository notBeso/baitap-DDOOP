package digidinos.Demo;

import digidinos.DAO.Database;

public class DatabaseDemo {
    Database database;
    public DatabaseDemo(Database db){
        this.database =db;
    }
    /**
     * test if insertTable function work correctly
     * @param String $name, Object $obj 
     * @return void
     */
    public void insertTableTest(String name, Object obj) {
        if (database.insertTable(name,obj)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }

    /**
     * test if selectTable function work correctly
     * @param String $name 
     * @return void
     */
    public void selectTableTest(String name) {
        if(database.selectTable(name).isEmpty()){
            System.out.println("No Data Found");
        } else {
            System.out.println("Data Found");
        }
    }

    /**
     * test if updateTable function work correctly
     * @param String $name, Object $obj 
     * @return void
     */
    public void updateTableTest(String name, Object obj) {
        if (database.updateTable(name,obj)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
     
    /**
     * test if deleteTable function work correctly
     * @param String $name, Object $obj 
     * @return void
     */
    public void deleteTableTest(String name, Object obj) {
        if (database.deleteTable(name,obj)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }

     /**
     * test if truncateTable function work correctly
     * @param String $name 
     * @return void
     */
    public void truncateTableTest(String name) {
        database.truncateTable(name);
        if (database.selectTable(name).isEmpty()) {
            System.out.println("Truncate Successful");
        } else {
            System.out.println("Truncate Failed");
        }
    }
}
