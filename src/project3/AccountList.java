package project3;

/**
 *
 * class Main
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLudin
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static WarehouseInventory warehouseInventory = new WarehouseInventory();
    public static AccountList accountList = new AccountList();
  
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bike Parts Distributorship Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    
  @Override
  public void stop() throws FileNotFoundException, IOException{
        FileOutputStream warehouseInventoryFileOut = new FileOutputStream("warehouseInvetory.ser");
        FileOutputStream accountListFileOut = new FileOutputStream("accountList.ser");
        ObjectOutputStream warehouseInventoryOut = new ObjectOutputStream(warehouseInventoryFileOut);
        ObjectOutputStream accountListOut = new ObjectOutputStream(accountListFileOut);
        warehouseInventoryOut.writeObject(warehouseInventory);
        warehouseInventoryOut.close();
        warehouseInventoryFileOut.close();
        accountListOut.writeObject(accountList);
        accountListOut.close();
        accountListFileOut.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file1 = new File("warehouseInventory.ser");
        File file2 = new File("accountList.ser");
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
            ObjectInputStream accountListIn  = new ObjectInputStream(accountListFile);
            accountList = (AccountList) accountListIn.readObject();
            accountListIn.close();
            accountListFile.close();                                                 
        }
            launch(args);
    }
}
