package digidinos.Demo;

import digidinos.DAO.Database;
import digidinos.entity.Accessory;

public class AccessoryDAODemo {
    Database database;

    /**
     * test database insetTable method
     * @param Accessory $accessory
     * @return void
     */
    public void insertTest(Accessory accessory){
        if (database.insertTable("Accessory",accessory)==1) {
            System.out.println("Insert Accessory Successful");
        } else {
            System.out.println("Insert Accessory Failed");
        }
    }

    /**
     * test database selectTable method
     * @param void
     * @return void
     */
    public void selectTest(){
        if(database.selectTable("Accessory").isEmpty()){
            System.out.println("No Accessory Data Found");
        } else {
            System.out.println("Accessory Data Found");
        }
    }

    /**
     * test database updateTable method
     * @param Accessory $accessory
     * @return void
     */
    public void updateTest(Accessory accessory){
        if (database.updateTable("Accessory", accessory)==1) {
            System.out.println("Update Accessory Successful");
        } else {
            System.out.println("Update Accessory Failed");
        }
    }

    /**
     * test database updateTableById method
     * @param int $id
     * @param Accessory $accessory
     * @return void
     */
    public void updateTableByIdTest(int ID,Accessory accessory){
        if (database.updateTableById(ID, accessory)==1) {
            System.out.println("Update Accessory Table Successful");
        } else {
            System.out.println("Update Accessory Table Failed");
        }
    }

    /**
     * test database deleteTable method
     * @param Accessory $accessory
     * @return void
     */
    public void deleteTest(Accessory accessory){
        if (database.deleteTable("Accessory", accessory)==true) {
            System.out.println("Delete Accessory Successful");
        } else {
            System.out.println("Delete Accessory Failed");
        }
    }

    /**
     * test database truncateTable method
     * @param void
     * @return void
     */
    public void truncateTest(){
        database.truncateTable("Accessory");
        if(database.selectTable("Accessory").isEmpty()){
            System.out.println("Truncate Accessory Successful");
        } else {
            System.out.println("Truncate Accessory Failed");
        }
    }
}