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

import static project3.Main.accountList;

public class Controller {

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
        private TextField phoneNumberAdminText;

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
        private TextField ageAdminText;

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

        }



        @FXML
        void doExamineParts(ActionEvent event) {

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
        myTextAreaAdminText.appendText("This login account " + usernameAdminText.getText() + " has been created for "
                + firstNameAdminText.getText() + " " + lastNameAdminText.getText() + "\n");
    }

    @FXML
    void doDeleteAccount(ActionEvent event) {
        myTextAreaAdminText.appendText("The login account for " + usernameAdminText.getText() +
                " has been successfully deleted" + "\n");
    }

    @FXML
    void doResetPassword(ActionEvent event) {
        myTextAreaAdminText.appendText("The account has successfully ");
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
    void doReadSalesInvoice(ActionEvent event) {

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
