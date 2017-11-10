package project3;

/**
 *
 * class Main
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 */

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
    
  /*@Override
    public void stop()
    {
        FileOutputStream warehouseInventoryFileOut = new FileOutputStream("warehouseInvetory.ser");
        FileOutputStream bikeDBFileOut = new FileOutputStream("bikeDB.ser");
        ObjectOutputStream warehouseInventoryOut = new ObjectOutputStream(warehouseInventoryFileOut);
        ObjectOutputStream bikeDBOut = new ObjectOutputStream("bikeDB.ser");
        warehouseInventoryOut.writeObject(warehouseInventory);
        warehouseInventoryOut.close();
        warehouseInventoryFileOut.close();
        bikeDBOut.writeObject(warehouseInventory);
        bikeDBOut.close();
        bikeDBFileOut.close();
    }*/

    public static void main(String[] args) {
        File file1 = new File("warehouseInventory.ser");
        File fil2 = new File("bikeDB.ser");
        if(file1.exists())
        }
            FileInputStream warehouseInventoryFile = new FileInputStream("warehouseInventory.ser");            
            ObjectInputStream warehouseInventoryIn = new ObjectInputStream(warehouseInventoryFile);            
            warehouseInventory = (WarehouseInventory) warehouseInventoryIn.readObject();
            warehouseInventoryIn.close();
            warehouseInventoryFile.close();            
         }
         if(file2.exists())
         {
            FileInputStream bikeDBFile = new FileInputStream("bikeDB.ser);
            ObjectInputStream bikeDBIn  = new ObjectInputStream(bikeDBFile);
            bikeDB = (bikeDB) bikeDBIn.readObject();
            bikeDBIn.close();
            bikeDBFile.close();                                                 
         }
            launch(args);
    }
}
