package project3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public ArrayList<BikePart> BikePartArray = new ArrayList<>();

    public ArrayList<BikePart> getBikePartArray() {
        return BikePartArray;
    }

    public static ArrayList<BikePart> bikePartArrayList = new ArrayList<>();

    public ArrayList<Inventory> inventoryWarehouse = new ArrayList<>();

    @FXML
    private Button updateWarehouseInventoryButton;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextArea myTextAreaAssociateText;

    @FXML
    private TextArea myTextAreaWarehouseText;

    @FXML
    private TextField emailAdminText;

    @FXML
    private TextField quantityAssociateText;

    @FXML
    private Button LogoutButton3;

    @FXML
    private Button LogoutButton2;

    @FXML
    private TextArea myTextAreaAdminText;

    @FXML
    private Button LogoutButton1;

    @FXML
    private TextField lastNameAdminText;

    @FXML
    private Button sellPartsButton;

    @FXML
    private Button LogoutButton4;

    @FXML
    private Button ExaminePartsButton;

    @FXML
    private TextArea myTextAreaOfficeText;

    @FXML
    private Button generateSalesInvoiceButton;

    @FXML
    private Button createAccountButton;

    @FXML
    private TextField StartDateText;

    @FXML
    private Button generateSalesPaycheckButton;

    @FXML
    private TextField usernameAdminText;

    @FXML
    private Button loginButton;

    @FXML
    private TextField salesVanFileNameText;

    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Tab salesAssociateTab;

    @FXML
    private TextField salesAssociateName;

    @FXML
    private Button resetPasswordButton;

    @FXML
    private Tab systemAdminTab;

    @FXML
    private TextField partNameAssociateText;

    @FXML
    private Tab warehouseManagerTab;

    @FXML
    private TextField firstNameAdminText;

    @FXML
    private Tab loginscreenTab;

    @FXML
    private TextField warehouseDeliveryFileText;

    @FXML
    private TextField partNumberAssociateText;

    @FXML
    private Button readWarehouseDeliveryButton;

    @FXML
    private TextField CustomerNameAssociateText;

    @FXML
    private Button deleteAccountButton;

    @FXML
    private TextField EndDateText;

    @FXML
    private Tab officeManagerTab;

    @FXML
    private TextField partNameOfficeManager;

    @FXML
    private TabPane tabPane;

    @FXML
    private Button refillPartStock;

    @FXML
    private TextField partNumberOfficeManager;

    @FXML
    private TextField warehouseNameText;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordAdminText;

    @FXML
    private MenuButton selectEmployeeButton;

    @FXML
    private MenuItem selectOfficeManager;

    @FXML
    private MenuItem selectWarehouseManger;

    @FXML
    private MenuItem selectSalesAssociate;

    /**
     * Sell bike part and quantity for Sales Associate tab
     * @param event
     */
    @FXML
    void doSellPartsButton(ActionEvent event) {
        SalesAssociate salesAssociateLoggedIn = Main.accountList.getSalesAssociate(salesAssociate);
        String partName = partNameAssociateText.getText();
        String soldQuantity = quantityAssociateText.getText();
        salesAssociateLoggedIn.getWarehouse().sell(partName, Integer.parseInt(soldQuantity));
        myTextAreaAssociateText.appendText("This part has been sold from the warehouse successfully: " + "\n");
        myTextAreaAssociateText.appendText(salesAssociateLoggedIn.getWarehouse().getInventory(partName).toString() + "\n");
        //myTextAreaAssociateText.appendText(salesAssociateLoggedIn.getWarehouse().getInventory(soldQuantity).toString() + "\n");

    }


    /**
     * Examine part information by part name and number for Office Manager tab
     * @param event
     */
    @FXML
    void doExamineParts(ActionEvent event) {

        String partName = partNameOfficeManager.getText();
        String partNumber = partNumberOfficeManager.getText();
        if(partNumber.equals("")){
            System.out.println(partName);
            myTextAreaOfficeText.appendText(Main.mainWH.getInventory(partName).toString() + "\n");
        }
        else {
            System.out.println(partNumber);
            myTextAreaOfficeText.appendText(Main.mainWH.getInventory(partNumber).toString() + "\n");
        }
    }



    @FXML
    void doRefillPartStock(ActionEvent event) {

    }

    /**
     * Read warehouse delivery file for Warehouse Manager tab
     * @param event
     */
    @FXML
    void doReadWarehouseDelivery(ActionEvent event) {
        String fn = warehouseDeliveryFileText.getText();
        String s = Main.mainWH.read(fn);
        myTextAreaWarehouseText.appendText(s);

    }

    /**
     * Login screen for four employee types: system administrator, office manager, warehouse manager, and sales associate
     * @param event
     */
    String salesAssociate = "";
    @FXML
    void doLoginButton(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        String user = usernameTextField.getText();
        String pass = passwordTextField.getText();
        for(LoginAccount a : Main.accountList.getAccounts()){
            if (a.getUserName().equals(user) && a.getPassword().equals(pass)){
                if(null != a.getType()) switch (a.getType()) {
                    case ADMIN:
                        systemAdminTab.setDisable(false);
                        loginscreenTab.setDisable(true);
                        warehouseManagerTab.setDisable(true);
                        officeManagerTab.setDisable(true);
                        salesAssociateTab.setDisable(true);
                        selectionModel.select(systemAdminTab);
                        break;
                    case OFFICE_MANAGER:
                        systemAdminTab.setDisable(true);
                        loginscreenTab.setDisable(true);
                        warehouseManagerTab.setDisable(true);
                        officeManagerTab.setDisable(false);
                        salesAssociateTab.setDisable(true);
                        selectionModel.select(officeManagerTab);
                        break;
                    case WAREHOUSE_MANAGER:
                        systemAdminTab.setDisable(true);
                        loginscreenTab.setDisable(true);
                        warehouseManagerTab.setDisable(false);
                        officeManagerTab.setDisable(true);
                        salesAssociateTab.setDisable(true);
                        selectionModel.select(warehouseManagerTab);
                        break;
                    case SALES_ASSOCIATE:
                        systemAdminTab.setDisable(true);
                        loginscreenTab.setDisable(true);
                        warehouseManagerTab.setDisable(true);
                        officeManagerTab.setDisable(true);
                        salesAssociateTab.setDisable(false);
                        selectionModel.select(salesAssociateTab);
                        salesAssociate = user;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /**
     * Create employee account for System Administrator tab
     */
    public static String accountType = "";
    @FXML
    void doCreateAccount(ActionEvent event) {
        String firstName = firstNameAdminText.getText();
        String lastName = lastNameAdminText.getText();
        String email = emailAdminText.getText();
        String username = usernameAdminText.getText();
        String password = passwordAdminText.getText();
        String warehousename = warehouseNameText.getText();

        switch(accountType) {
            case "Office Manager":
                Main.accountList.add(new OfficeManager(new Person(firstName, lastName, email), username, password));
                break;

            case "Warehouse Manager":
                Main.accountList.add(new WarehouseManager(new Person(firstName, lastName, email), username, password));
                break;

            case "Sales Associate":
                Main.accountList.add(new SalesAssociate(new Person(firstName, lastName, email), username, password, warehousename));
                break;
        }
        myTextAreaAdminText.appendText(accountType + "account " + username + " has been created. \n");
    }

    /**
     * Delete employee account for System Administrator tab
     * @param event
     */
    @FXML
    void doDeleteAccount(ActionEvent event) {
        String username = usernameAdminText.getText();
        Main.accountList.delete(username);
        myTextAreaAdminText.appendText("Deleted " + username + " from the system. \n");
    }

    @FXML
    void doResetPassword(ActionEvent event) {

    }

    /**
     * Log out button for System Administrator tab
     * @param event
     */
    @FXML
    void doLogoutButton1(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        systemAdminTab.setDisable(true);
        loginscreenTab.setDisable(false);
        warehouseManagerTab.setDisable(true);
        officeManagerTab.setDisable(true);
        salesAssociateTab.setDisable(true);
        selectionModel.select(loginscreenTab);

    }

    /**
     * Generate a sales invoice for Sales Associate tab
     * @param event
     */
    @FXML
    void doGenerateSalesInvoice(ActionEvent event) {
        String customer = CustomerNameAssociateText.getText();
        if(customer.equals("")) {
            myTextAreaAssociateText.appendText("Must enter customer name");
        }
        SalesInvoice salesInvoice = new SalesInvoice(new Date(), customer);
        myTextAreaAssociateText.appendText("Sales invoice for: " + customer + "\n");
        myTextAreaAssociateText.appendText("Part Name  Part Number  List Price  Sale Price  Quantity   Total\n");
        double aTotalInvoicePrice = 0;
        //myTextAreaAssociateText.appendText(Main.mainWH.getInventory().toString() + "\n");

    }

    @FXML
    void doGenerateSalesVanFileButton(ActionEvent event) {


    }

    /**
     * Log out button for Office Manager tab
     * @param event
     */
    @FXML
    void doLogoutButton2(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        systemAdminTab.setDisable(true);
        loginscreenTab.setDisable(false);
        warehouseManagerTab.setDisable(true);
        officeManagerTab.setDisable(true);
        salesAssociateTab.setDisable(true);
        selectionModel.select(loginscreenTab);


    }

    @FXML
    void doGenerateSalesPaycheck(ActionEvent event) {
        Date start, end;
        String startDate = StartDateText.getText();
        String endDate = EndDateText.getText();
        if (startDate.equals("") && endDate.equals("")) {
            start = null;
            end = null;
        }
        else {
            start = new Date();
            end = new Date();
        }

        for(LoginAccount a : Main.accountList.getAccounts()) {
            if(a instanceof SalesAssociate) {
                SalesAssociate sa = (SalesAssociate) a;
                List<SalesInvoice> salesInvoiceList = sa.getSales(start, end);
                for(SalesInvoice si : salesInvoiceList) {
                    myTextAreaOfficeText.appendText(si.toString());

                }

            }
        }
    }

    /**
     * Log out button for Warehouse Manager tab
     * @param event
     */
    @FXML
    void doLogoutButton3(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        systemAdminTab.setDisable(true);
        loginscreenTab.setDisable(false);
        warehouseManagerTab.setDisable(true);
        officeManagerTab.setDisable(true);
        salesAssociateTab.setDisable(true);
        selectionModel.select(loginscreenTab);

    }

    @FXML
    void doUpdateWarehouseInventoryButton(ActionEvent event) {
        String updateWH = warehouseDeliveryFileText.getText();
        System.out.println(updateWH);
        String u = Main.mainWH.update(updateWH, inventoryWarehouse);
        System.out.println(u);
        myTextAreaWarehouseText.appendText(u);
        //myTextAreaWarehouseText.appendText(Main.mainWH.toString());
        }

    /**
     * Log out button for Sales Associate tab
     * @param event
     */
    @FXML
    void doLogoutButton4(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        systemAdminTab.setDisable(true);
        loginscreenTab.setDisable(false);
        warehouseManagerTab.setDisable(true);
        officeManagerTab.setDisable(true);
        salesAssociateTab.setDisable(true);
        selectionModel.select(loginscreenTab);

    }

    @FXML
    void doSelectEmployee(ActionEvent event) {

    }

    /**
     * Create Sales Associate account
     * @param event
     */
    @FXML
    void createSalesAssociateAction(ActionEvent event) {
        accountType = "Sales Associate";
        selectEmployeeButton.setText(accountType);
    }

    /**
     * Create Warehouse Manager account
     * @param event
     */
    @FXML
    void createWarehouseManagerAction(ActionEvent event) {
        accountType = "Warehouse Manager";
        selectEmployeeButton.setText(accountType);
    }

    /**
     * Create Office Manager account
     * @param event
     */
    @FXML
    void createOfficeManagerAction(ActionEvent event) {
        accountType = "Office Manager";
        selectEmployeeButton.setText(accountType);
    }

}