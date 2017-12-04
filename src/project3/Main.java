package project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import person.Person;

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
 */
public class Main extends Application {
    public static WarehouseInventory warehouseInventory = new WarehouseInventory();
    public static AccountList accountList = AccountList.getObject();
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
        FileOutputStream mainWarehouseFileOut = new FileOutputStream("mainWarehouse.ser");
        ObjectOutputStream warehouseInventoryOut = new ObjectOutputStream(warehouseInventoryFileOut);
        ObjectOutputStream accountListOut = new ObjectOutputStream(accountListFileOut);
        ObjectOutputStream mainWarehouseOut = new ObjectOutputStream(mainWarehouseFileOut);
        warehouseInventoryOut.writeObject(warehouseInventory);
        warehouseInventoryOut.close();
        warehouseInventoryFileOut.close();
        accountListOut.writeObject(accountList);
        accountListOut.close();
        accountListFileOut.close();
        mainWarehouseOut.writeObject(mainWH);
        mainWarehouseOut.close();
        mainWarehouseFileOut.close();
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
        File file4 = new File("mainWarehouse.ser");
        if(file1.exists()) {
            FileInputStream warehouseInventoryFile = new FileInputStream("warehouseInventory.ser");
            ObjectInputStream warehouseInventoryIn = new ObjectInputStream(warehouseInventoryFile);
            warehouseInventory = (WarehouseInventory) warehouseInventoryIn.readObject();
            warehouseInventoryIn.close();
            warehouseInventoryFile.close();
        }
        if(file2.exists()) {
            FileInputStream accountListFile = new FileInputStream("accountList.ser");
            ObjectInputStream accountListIn  = new ObjectInputStream(accountListFile);
            accountList = (AccountList) accountListIn.readObject();
            accountListIn.close();
            accountListFile.close();
        }
        if(file4.exists()){
            FileInputStream mainWarehouseFile = new FileInputStream("mainWarehouse.ser");
            ObjectInputStream mainWarehouseIn = new ObjectInputStream(mainWarehouseFile);
            mainWH = (MainWarehouse) mainWarehouseIn.readObject();
            mainWarehouseIn.close();
            mainWarehouseFile.close();
        }
        if(!(file1.exists()&&file2.exists()&&file4.exists())) {
            
            //System administrator
            accountList.add(new SystemAdministrator(new Person("Andy", "Luong", "Andy@bikepart.com"), "aluong", "admin"));
            //Office manager
            accountList.add(new OfficeManager(new Person("Alex", "Lundin", "Alex@bikepart.com"), "alundin", "manager"));
            //Warehouse manager
            accountList.add(new WarehouseManager(new Person("Anthony", "Phimmasone", "Anthony@bikepart.com"), "aphimmas", "manager"));
            //Sales associate #1
            accountList.add(new SalesAssociate(new Person("Brian", "Justice", "Brian@bikepart.com"), "bjustice", "associate", "salesAssociate"));
            //Sales associate #2
            accountList.add(new SalesAssociate(new Person("Gusty", "Cooper", "Gusty@bikepart.com"), "gcooper", "associate", "gustysalesassociate"));
            //Sales associate #3
            accountList.add(new SalesAssociate(new Person("Bob", "Smith", "Bob@bikepart.com"), "bsmith", "associate", "bobsalesassociate"));

            File file = new File("salesvanMain.txt"); //Main sales associate
            File file3 = new File("mainInventory.txt"); //Main warehouse
            Scanner scanner = new Scanner(file);
            Scanner scanner2 = new Scanner(file3);
            while (scanner.hasNext()) {
                accountList.getSalesAssociate("bjustice").getWarehouse().addInventory(scanner.next());
            }
            while (scanner2.hasNext()) {
                mainWH.addInventory(scanner2.next());
            }
        }
        launch(args);
    }
}