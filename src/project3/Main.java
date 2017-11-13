package project3;

/**
 *
 * class Main
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @uthor alexLudin
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bike Parts Distributorship Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    
  @Override
  public void stop(){
        FileOutputStream warehouseInventoryFileOut = new FileOutputStream("warehouseInvetory.ser");
        FileOutputStream accountListFileOut = new FileOutputStream("accountList.ser");
        ObjectOutputStream warehouseInventoryOut = new ObjectOutputStream(warehouseInventoryFileOut);
        ObjectOutputStream accountListOut = new ObjectOutputStream(accountListFileOut);
        warehouseInventoryOut.writeObject(warehouseInventory);
        warehouseInventoryOut.close();
        warehouseInventoryFileOut.close();
        accountListOut.writeObject(warehouseInventory);
        accountListDBOut.close();
        accountListFileOut.close();
    }

    public static void main(String[] args) {
        File file1 = new File("warehouseInventory.ser");
        File file2 = new File("accountList.ser");
        WarehouseInventory warehouseInventory = new WarehouseInventory();
        AccountList accountList = new accountList();
        if(file1.exists())
        { 
            FileInputStream warehouseInventoryFile = new FileInputStream("warehouseInventory.ser");            
            ObjectInputStream warehouseInventoryIn = new ObjectInputStream(warehouseInventoryFile);            
            warehouseInventory = (WarehouseInventory) warehouseInventoryIn.readObject();
            warehouseInventoryIn.close();
            warehouseInventoryFile.close();            
        }
        if(file2.exists())
        {
            FileInputStream accountListFile = new FileInputStream("accountList.ser");
            ObjectInputStream accountListIn  = new ObjectInputStream(bikeDBFile);
            accountList = (accountList) accountListIn.readObject();
            accountListIn.close();
            accountListFile.close();                                                 
        }
            launch(args);
    }
}
