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
import java.util.Scanner;

public class Controller {

    public ArrayList<BikePart> BikePartArray = new ArrayList<>();

    public ArrayList<BikePart> getBikePartArray() {
        return BikePartArray;
    }

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
        private TextField passwordAdminText;



        @FXML
        void doSellPartsButton(ActionEvent event) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter BikePart Number: ");
            int partNumber = in.nextInt();

            boolean Found = false;
            Date date = new Date();
            int i = 0;
            while (i < BikePartArray.size() && !Found) {

                if (BikePartArray.get(i).getPartNumber() == (partNumber)) {
                    Found = true;
                    if (BikePartArray.get(i).getOnSale()) {
                        System.out.println("Part is on sale this is the sales price and the quantity");
                        System.out.println(BikePartArray.get(i).getPartName() + " " + BikePartArray.get(i).getSalesPrice() + " " + BikePartArray.get(i).getSoldQuantity());
                        System.out.println("Time and date sold" + date);
                    } else if (BikePartArray.get(i).getOnSale()) {
                        System.out.println("Part is not on sale this is the list price");
                        System.out.println(BikePartArray.get(i).getPartName() + " " + BikePartArray.get(i).getListPrice() + " " + BikePartArray.get(i).getSoldQuantity());
                        System.out.println("Time and date sold" + date);
                    }
                }
                i += 1;
            }
            if (!Found) {
                System.out.print("Part Number Not Found!");
            }
        }



        @FXML
        void doExamineParts(ActionEvent event) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter BikePart Name: ");
            String partName = in.nextLine();
            //System.out.println("hello :" + partName);

            boolean Found = false;
            int j = 0;

            while (j < BikePartArray.size() && !Found) {
                //System.out.println(j + "This is J");


                if (BikePartArray.get(j).getPartName().equals(partName)) {
                    Found = true;
                    if (BikePartArray.get(j).getOnSale()) {
                        System.out.println("Part Name is on sale this is the sales price");
                        System.out.println(BikePartArray.get(j).getPartName() + " " + BikePartArray.get(j).getSalesPrice());
                    } else if (!BikePartArray.get(j).getOnSale()) {
                        System.out.println("Part Name is not on sale this is the list price");
                        System.out.println(BikePartArray.get(j).getPartName() + " " + BikePartArray.get(j).getListPrice());
                    }
                }
                j += 1;
            }

            if (!Found) {
                System.out.print("Part Name Not Found!");
            }
        }



        @FXML
        void doRefillPartStock(ActionEvent event) {

        }

        @FXML
        void doReadWarehouseDelivery(ActionEvent event) {

        }

    @FXML
    void doLoginButton(ActionEvent event) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        systemAdminTab.setDisable(false);
        loginscreenTab.setDisable(true);
        warehouseManagerTab.setDisable(false);
        officeManagerTab.setDisable(false);
        salesAssociateTab.setDisable(false);
        selectionModel.select(systemAdminTab);
    }

    @FXML
    void doCreateAccount(ActionEvent event) {

    }

    @FXML
    void doDeleteAccount(ActionEvent event) {

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
    ArrayList<BikePart> doReadSalesInvoice(ActionEvent event) {
            ArrayList<BikePart> BikePartArray = null;
            try {
                myTextAreaOfficeText.appendText("Enter Input File: ");
                Scanner user = new Scanner(System.in);
                String inputFile = user.nextLine();
                File input = new File(inputFile);
                BikePartArray = new ArrayList<>();
                Scanner read = new Scanner(input);
                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    String regularEXPRESSION = ",";
                    String[] presentValue = line.split(regularEXPRESSION);
                    System.out.println(Arrays.toString(presentValue));
                    BikePart bp = new BikePart(presentValue[0], Integer.parseInt(presentValue[1]), Double.parseDouble(presentValue[2]),
                            Double.parseDouble(presentValue[3]));
                    BikePartArray.add(bp);
                }
            }   catch (FileNotFoundException e) {
                System.out.println("file not found");
                e.printStackTrace();
            }
            return BikePartArray;
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

}
