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


    public static void main(String[] args) {
      /*FileInputStream warehouseInventoryFile = new FileInputStream("warehouseInventory.ser");
        FileInputStream bikeDBFile = new FileInputStream("bikeDB.ser);
        ObjectInputStream warehouseInventoryIn = new ObjectInputStream(warehouseInventoryFile);
        ObjectInputStream bikeDBIn  = new ObjectInputStream(bikeDBFile);
        warehouseInventory = (WarehouseInventory) warehouseInventoryIn.readObject();
        warehouseInventoryIn.close();
        warehouseInventoryFile.close();
        bikeDB = (bikeDB) bikeDBIn.readObject();
        bikeDBIn.close();
        bikeDBFile.close();
        */
        launch(args);
    }
}
