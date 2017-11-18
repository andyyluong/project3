package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static sample.Command.doRead;

/**
 * Class Controller
 * This is a controller class that functions the GUIs commands
 * @author Anthony Phimmasone
 * @course CPSC 240
 * @professor Cooper
 * @version 2017.2.3
 * @build 172.3968.16
 *
 */
public class Controller {
    public static Command CMD = new Command();
    public static ArrayList<BikePart> bikePartArrayList = new ArrayList<>();

    @FXML
    private TextField inputFileText;

    @FXML
    private TextField outputFileNameText;

    @FXML
    private Button createButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button moveButton;

    @FXML
    private TextArea myTextArea;

    @FXML
    private TextField fromWarehouseText;

    @FXML
    private TextField commandParamText;

    @FXML
    private Button doCommandButton;

    @FXML
    private TextField warehouseNameText;

    @FXML
    private TextField commandText;

    @FXML
    private TextField toWarehousetext;

    /**
     * method doUpdateButton
     * @param event
     */

    //Updates a warehouse

    @FXML
    void doUpdateButton(ActionEvent event) {
        //myTextArea.appendText(inputFileText.getText() + " has been updated in " + warehouseNameText.getText() + "\n");
        String updateWH = inputFileText.getText();
        WarehouseInventory.updateWarehouse(updateWH, bikePartArrayList);
    }

    /**
     * method doCreateButton
     * @param event
     */

    //Creates a warehouse

    @FXML
    void doCreateButton(ActionEvent event) {
        //myTextArea.appendText("A new warehouse named " + warehouseNameText.getText() + " has been created in " + inputFileText.getText() + "\n");
        String createWH = inputFileText.getText();
        WarehouseInventory.createWarehouse(createWH, bikePartArrayList);

        String whName = warehouseNameText.getText();
        String whFileName = inputFileText.getText();
    }

    /**
     * method doMoveButton
     * @param event
     */

    //Moves bike parts to a warehouse

    @FXML
    void doMoveButton(ActionEvent event) {
        //myTextArea.appendText("A new warehouse named " + fromWarehouseText.getText() + " has moved bike parts to " + toWarehousetext.getText() + " warehouse in " + outputFileNameText.getText() + "\n");
        String fromWarehouse = fromWarehouseText.getText();
        String toWarehouse = toWarehousetext.getText();
        String moveWarehouses = outputFileNameText.getText();
    }

    /**
     * method doCommandButton
     * @param event
     */

    //Handles commands (Read, Enter, Sell, Display, sort name & sort number)
    @FXML
    void doCommandButton(ActionEvent event) {
        //myTextArea.appendText("You have entered the " + commandText.getText() + " command for " + commandParamText.getText() + "\n");

        String CMD = commandText.getText();
        String param = commandParamText.getText();

        System.out.println(CMD + " " + param);

        doRead("MainWarehouse.txt");

        //bikePartArrayList = doRead(param);

        switch (CMD) {
            case "read":
                ArrayList <BikePart> tempList;
                tempList = doRead(param);
                for (BikePart readParts:tempList){
                    Main.mainWarehouse.addBikePart(readParts);
                }
                bikePartArrayList = doRead(param);
                if (bikePartArrayList != null) {
                    myTextArea.appendText("This warehouse has read successfully: " + "\n");
                    myTextArea.appendText("\n");
                    myTextArea.appendText("**************************************************************************");
                    myTextArea.appendText("\n");
                    for (BikePart bp : bikePartArrayList) {
                        myTextArea.appendText(bp + "\n");
                        Main.mainWarehouse.addBikePart(bp);
                    }
                    myTextArea.appendText("\n \n \n");
                    myTextArea.appendText(("************************************************************************"));
                } else
                    myTextArea.appendText("File Not Found");
                break;

            case "enter":
                bikePartArrayList.add(Command.doEnter(param));
                myTextArea.appendText("This part has been entered into the warehouse successfully: " + "\n");
                if (bikePartArrayList != null) {
                    myTextArea.appendText(param + "\n");
                    myTextArea.appendText("\n \n \n");
                    myTextArea.appendText(("************************************************************************"));
                }
                break;

            case "sell":
                //Can only sell a part that has just been entered
                myTextArea.appendText("This part has been sold from the warehouse successfully: " + "\n");
                myTextArea.appendText(Command.doSell(param) + "\n");
                if (bikePartArrayList != null) {
                    myTextArea.appendText("\n \n \n");
                    myTextArea.appendText(("************************************************************************"));
                } else
                    myTextArea.appendText("Part Number Not Found");
                break;

            case "display":
                myTextArea.appendText("Part Name " + " Part Price" + "\n");
                myTextArea.appendText(Command.doDisplay(param) + "\n");
                myTextArea.appendText("\n \n \n");
                myTextArea.appendText(("************************************************************************"));
                if (bikePartArrayList != null) {

                } else
                    myTextArea.appendText("Part Name Not Found");
                myTextArea.appendText("\n \n \n");
                myTextArea.appendText(("************************************************************************"));
                break;

            case "sortname":
                myTextArea.appendText("This warehouse has been sorted by part name successfully" + "\n");
                myTextArea.appendText(Command.doSortName() +"\n");
                    myTextArea.appendText("\n \n \n");
                    myTextArea.appendText(("************************************************************************"));

                break;
            case "sortnumber":
                myTextArea.appendText("This warehouse has been sorted by part number successfully" + "\n");
                myTextArea.appendText(Command.doSortNumber() + "\n");
                for (BikePart bp : bikePartArrayList) {
                    myTextArea.appendText(bp + "\n");
                }
                myTextArea.appendText("\n \n \n");
                myTextArea.appendText(("************************************************************************"));
                break;

            case "save":
                myTextArea.appendText(Command.doWrite(param,bikePartArrayList) + "\n");
                myTextArea.appendText("You have successfully saved the warehouse information" + "\n");
                for (BikePart bp : bikePartArrayList) {
                    myTextArea.appendText(bp + "\n");
                }
                myTextArea.appendText("\n \n \n");
                myTextArea.appendText(("************************************************************************"));
                break;

            default:
                myTextArea.appendText("Invalid command! Please Try Again.");

        }
    }
}