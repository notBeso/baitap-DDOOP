// package digidinos.Demo;

// import digidinos.DAO.Database;

// abstract  class BaseDAODemo {
//     protected Database db;

//     public BaseDAODemo (Database db) {
//         this.db = db;
//     }

//     /**
//      * test db insetTable method
//      * @param Accessory $accessory
//      * @return void
//      */
//     public void insertTest(String name, Object obj){
//         if (db.insertTable(name,obj)==1) {
//             System.out.println("Insert Successful");
//         } else {
//             System.out.println("Insert Failed");
//         }
//     }

//     /**
//      * test db selectTable method
//      * @param void
//      * @return void
//      */
//     public void selectTest(String name){
//         if(db.selectTable(name).isEmpty()){
//             System.out.println("No Data Found");
//         } else {
//             System.out.println("Data Found");
//         }
//     }

//     /**
//      * test db updateTable method
//      * @param Accessory $accessory
//      * @return void
//      */
//     public void updateTest(String name,Object obj){
//         if (db.updateTable(name, obj)==1) {
//             System.out.println("Update Successful");
//         } else {
//             System.out.println("Update Failed");
//         }
//     }

//     /**
//      * test db updateTableById method
//      * @param int $id
//      * @param Accessory $accessory
//      * @return void
//      */
//     public void updateTableByIdTest(int id, Object obj){
//         if (db.updateTableById(id, obj)==1) {
//             System.out.println("Update Table Successful");
//         } else {
//             System.out.println("Update Table Failed");
//         }
//     }

//     /**
//      * test db deleteTable method
//      * @param Accessory $accessory
//      * @return void
//      */
//     public void deleteTest(String name,Object obj){
//         if (db.deleteTable(name, obj)==true) {
//             System.out.println("Delete Successful");
//         } else {
//             System.out.println("Delete Failed");
//         }
//     }

//     /**
//      * test db truncateTable method
//      * @param void
//      * @return void
//      */
//     public void truncateTest(String name){
//         db.truncateTable(name);
//         if(db.selectTable(name).isEmpty()){
//             System.out.println("Truncate Successful");
//         } else {
//             System.out.println("Truncate Failed");
//         }
//     }

// }
