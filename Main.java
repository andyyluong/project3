package project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class Main extends Application {
    public static WarehouseInventory warehouseInventory = new WarehouseInventory();
    public static AccountList accountList = AccountList.getObject();
    //public static MainWarehouse mainWH = new MainWarehouse("mainWH", WarehouseType.MAIN);
    public static MainWarehouse mainWH = new MainWarehouse("mainWH", WarehouseType.MAIN);

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bike Parts Distributorship Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    /**
     * Program execution stops
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Override
    public void stop() throws FileNotFoundException, IOException{
        FileOutputStream warehouseInventoryFileOut = new FileOutputStream("warehouseInventory.ser");
        FileOutputStream accountListFileOut = new FileOutputStream("accountList.ser");
        ObjectOutputStream warehouseInventoryOut = new ObjectOutputStream(warehouseInventoryFileOut);
        ObjectOutputStream accountListOut = new ObjectOutputStream(accountListFileOut);
        //warehouseInventoryOut.writeObject(warehouseInventory);
        warehouseInventoryOut.close();
        warehouseInventoryFileOut.close();
        accountListOut.writeObject(accountList);
        accountListOut.close();
        accountListFileOut.close();
    }

    /**
     * Main method
     * @param args Command-line arguments
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file1 = new File("warehouseInventory.ser");
        File file2 = new File("accountList.ser");
        if(file1.exists())
        {
            FileInputStream warehouseInventoryFile = new FileInputStream("warehouseInventory.ser");
            ObjectInputStream warehouseInventoryIn = new ObjectInputStream(warehouseInventoryFile);
            //warehouseInventory = (WarehouseInventory) warehouseInventoryIn.readObject();
            warehouseInventoryIn.close();
            warehouseInventoryFile.close();
        }
        if(file2.exists())
        {
            FileInputStream accountListFile = new FileInputStream("accountList.ser");
            ObjectInputStream accountListIn  = new ObjectInputStream(accountListFile);
            //accountList = (AccountList) accountListIn.readObject();
            accountListIn.close();
            accountListFile.close();
        }

        //System administrator
        accountList.add(new SystemAdministrator(new Person("Andy", "Luong", "Andy@bikepart.com"), "aluong", "admin"));
        //Office manager
        accountList.add(new OfficeManager(new Person("Anthony", "Phimmasone", "Anthony@bikepart.com"), "aphimmas", "manager"));
        //Warehouse manager
        accountList.add(new WarehouseManager(new Person("Alex", "Lundin", "Alex@bikepart.com"), "alundin", "associate"));
        //Sales associate #1
        accountList.add(new SalesAssociate(new Person("Brian", "Justice", "Brian@bikepart.com"), "bjustice", "manager", "salesAssociate"));
        //Sales associate #2
        accountList.add(new SalesAssociate(new Person("Gusty", "Cooper", "Gusty@bikepart.com"), "gcooper", "ssociate", "gustysalesassociate"));

        File file = new File("initialInventory.txt");
        File file3 = new File("updateInventory.txt");
        Scanner scanner = new Scanner (file);
        Scanner scanner2 = new Scanner (file3);
        while (scanner.hasNext()) {
            accountList.getSalesAssociate("alundin").getWarehouse().addInventory(scanner.next());
        }
        while (scanner2.hasNext()) {
            mainWH.addInventory(scanner2.next());
        }
        launch(args);
    }
}