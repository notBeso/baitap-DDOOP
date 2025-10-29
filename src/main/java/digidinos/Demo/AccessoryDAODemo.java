package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Accessory;

public class AccessoryDAODemo {
    Database database;
    // test Database insetTable method
    public void insertTest(Accessory accessory){
        if (database.insertTable("Accessory",accessory)==1) {
            System.out.println("Insert Accessory Successful");
        } else {
            System.out.println("Insert Accessory Failed");
        }
    }

    public void selectTest(){
        // test database selectTable method
        if(database.selectTable("Accessory").isEmpty()){
            System.out.println("No Accessory Data Found");
        } else {
            System.out.println("Accessory Data Found");
        }
    }

    public void updateTest(Accessory accessory){
        // test database updateTable method
        if (database.updateTable("Accessory", accessory)==1) {
            System.out.println("Update Accessory Successful");
        } else {
            System.out.println("Update Accessory Failed");
        }
    }

    public void updateTableByIdTest(int ID,Accessory accessory){
        // test database updateTableById method
        if (database.updateTableById(ID, accessory)==1) {
            System.out.println("Update Accessory Table Successful");
        } else {
            System.out.println("Update Accessory Table Failed");
        }
    }

    public void deleteTest(Accessory accessory){
        // test database deleteTable method
        if (database.deleteTable("Accessory", accessory)==true) {
            System.out.println("Delete Accessory Successful");
        } else {
            System.out.println("Delete Accessory Failed");
        }
    }

    public void truncateTest(){
        // test database truncateTable method
        database.truncateTable("Accessory");
        if(database.selectTable("Accessory").isEmpty()){
            System.out.println("Truncate Accessory Successful");
        } else {
            System.out.println("Truncate Accessory Failed");
        }
    }
}
