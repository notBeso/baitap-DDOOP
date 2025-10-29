package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Accessory;

public class AccessoryDAODemo {
    public static void insertTest(Accessory accessory){
        // test Database insetTable method
        if (Database.insertTable("Accessory",accessory)==1) {
            System.out.println("Insert Accessory Successful");
        } else {
            System.out.println("Insert Accessory Failed");
        }
    }
    public static void selectTest(){
        // test Database selectTable method
        if(Database.selectTable("Accessory").isEmpty()){
            System.out.println("No Accessory Data Found");
        } else {
            System.out.println("Accessory Data Found");
        }
    }
    public static void updateTest(Accessory accessory){
        // test Database updateTable method
        if (Database.updateTable("Accessory", accessory)==1) {
            System.out.println("Update Accessory Successful");
        } else {
            System.out.println("Update Accessory Failed");
        }
    }
    public static void updateTableByIdTest(int ID,Accessory accessory){
        // test Database updateTableById method
        if (Database.updateTableById(ID, accessory)==1) {
            System.out.println("Update Accessory Table Successful");
        } else {
            System.out.println("Update Accessory Table Failed");
        }
    }
    public static void deleteTest(Accessory accessory){
        // test Database deleteTable method
        if (Database.deleteTable("Accessory", accessory)==true) {
            System.out.println("Delete Accessory Successful");
        } else {
            System.out.println("Delete Accessory Failed");
        }
    }
    public static void truncateTest(){
        // test Database truncateTable method
        Database.truncateTable("Accessory");
        if(Database.selectTable("Accessory").isEmpty()){
            System.out.println("Truncate Accessory Successful");
        } else {
            System.out.println("Truncate Accessory Failed");
        }
    }
}
