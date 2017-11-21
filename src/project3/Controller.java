package project3;

import javafx.collections.ObservableList;
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
import java.util.Scanner;

public class Controller {

    public ArrayList<BikePart> BikePartArray = new ArrayList<>();

    public ArrayList<BikePart> getBikePartArray() {
        return BikePartArray;
    }

    public static ArrayList<BikePart> bikePartArrayList = new ArrayList<>();

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

    @FXML
    void doSellPartsButton(ActionEvent event) {

    }


    @FXML
    void doExamineParts(ActionEvent event) {

        String partname = partNameOfficeManager.getText();
        String partnumber = partNumberOfficeManager.getText();


    }



    @FXML
    void doRefillPartStock(ActionEvent event) {

    }

    @FXML
    void doReadWarehouseDelivery(ActionEvent event) {
        String fn = warehouseDeliveryFileText.getText();
        String s = Main.mainWH.read(fn);
        myTextAreaWarehouseText.appendText(s);


    }

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
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static String accountType = "Office Manager";
    @FXML
    void doCreateAccount(ActionEvent event) {
        String firstName = firstNameAdminText.getText();
        String lastName = lastNameAdminText.getText();
        String email = emailAdminText.getText();
        String username = usernameAdminText.getText();
        String password = passwordAdminText.getText();
        String warehousename = warehouseNameText.getText();
        /*
        --More code here--
        */
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
        myTextAreaAdminText.appendText(accountType + " " + username + " has been created.");
    }

    @FXML
    void doDeleteAccount(ActionEvent event) {
        String username = usernameAdminText.getText();
        Main.accountList.delete(username);
        myTextAreaAdminText.appendText("Deleted " + username + " from the system.");
    }

    @FXML
    void doResetPassword(ActionEvent event) {

    }

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

    @FXML
    void doGenerateSalesInvoice(ActionEvent event) {

    }

    @FXML
    void doGenerateSalesVanFileButton(ActionEvent event) {


    }

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

    }

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
    void doLoadWarehouseDelivery(ActionEvent event) {

    }

    @FXML
    void doUpdateWarehouseInventoryButton(ActionEvent event) {

    }

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

    @FXML
    void createSalesAssociateAction(ActionEvent event) {
        accountType = "Sales Associate";
        selectEmployeeButton.setText(accountType);
    }

    @FXML
    void createWarehouseManagerAction(ActionEvent event) {
        accountType = "Warehouse Manager";
        selectEmployeeButton.setText(accountType);
    }

    @FXML
    void createOfficeManagerAction(ActionEvent event) {
        accountType = "Office Manager";
        selectEmployeeButton.setText(accountType);
    }

}