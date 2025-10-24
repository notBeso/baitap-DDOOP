package digidinos.Demo;

import digidinos.DAO.AccesoryDAO;
import digidinos.DAO.Database;
import digidinos.entity.Accessory;

public class AccessoryDAODemo {
    private static DatabaseDemo db;

    public static void insertTest(Database db, Accessory p){
        if (AccesoryDAO.insert(db,p)==1) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Failed");
        }
    }
    // public static void selectTest(Database db){
    //     if(Database.selectTable(db,"Accessory").isEmpty()){
    //         System.out.println("No Data Found");
    //     } else {
    //         System.out.println("Data Found");
    //     }
    // }
    public static void updateTest(Database db, String name, Accessory a){
        if (AccesoryDAO.update(db, name, a)==1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }
    }
    public static void deleteTest(Database db, Accessory a){
        if (AccesoryDAO.delete(db, a)==true) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
    }
    // public static void truncateTest(Database db){
    //     if (db.productTable.isEmpty()) {
    //         System.out.println("Truncate Successful");
    //     } else {
    //         System.out.println("Truncate Failed");
    //     }
    // }
}
