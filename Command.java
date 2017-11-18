package sample;

import java.io.*;
import java.util.*;

/**
 * Class Command
 * @author Anthony Phimmasone
 * @course CPSC 240
 * @professor Cooper
 * @version 2017.2.3
 * @build 172.3968.16
 *
 */

/*
 * The Command is where the user can access information from the text file.
 * The user can read from an inventory delivery file, enter a part, sell a part, display a part,
 * sort a part by name, sort a part by number, and quit the program.
 */
public class Command {

    public static ArrayList<BikePart> bikePartArrayList = new ArrayList<>();

    public static ArrayList<BikePart> getBikePartArrayList() {
        return bikePartArrayList;
    }

    /**
     * Method ArrayList<BikePart> doRead
     * @return returnList
     */

    /*
     * This prompts the user for a to enter a filename. Once the file name is entered, if the file is found the file will be read.
     * The output will display all the information in the text file and will show what is updated. (Part name, part number, list price,
     * sale price, on sale, and quantity of the bike part).
     * If the file is not found the output will display "file not found".
     */

    public static ArrayList<BikePart> doRead(String fileName) {
        ArrayList<BikePart> bikePartArrayList = null;
        try {
            File input = new File(fileName);
            bikePartArrayList = new ArrayList<>();
            Scanner read = new Scanner(input);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String regularEXPRESSION = ",";
                String[] presentValue = line.split(regularEXPRESSION);
                System.out.println(Arrays.toString(presentValue));
                BikePart bp = new BikePart(presentValue[0], Integer.parseInt(presentValue[1]), Double.parseDouble(presentValue[2]),
                        Double.parseDouble(presentValue[3]), Boolean.parseBoolean(presentValue[4]), Integer.parseInt(presentValue[5]));
                bikePartArrayList.add(bp);
            }
        }   catch (FileNotFoundException e) {
            return null;
        }
        return bikePartArrayList;
    }

    /**
     * Method doWrite
     * @param filename
     * @param bpArray
     */
    public static String doWrite(String filename, ArrayList<BikePart> bpArray) {
        try {
            PrintWriter writer = new PrintWriter(filename, "UTF-8");
            for (BikePart bp : bpArray)
                writer.println(bp); // uses sample.BikePart toString()
            writer.close();
        }   catch (IOException e) {
            System.out.println("file error!");
            e.printStackTrace();
        }
        return filename;
    }

    /**
     * Method doEnter
     */

    /*
     * This allows the user to enter in information about the parts and will be added to BikeParts.txt.
     */
    public static BikePart doEnter(String enterBikePart) {
        //Enter BikePart Name
        String partName = enterBikePart.split(",")[0];
        //Enter BikePart Number
        int partNumber = Integer.parseInt(enterBikePart.split(",")[1]);
        //Enter BikePart list price
        double listPrice = Double.parseDouble(enterBikePart.split(",")[2]);
        //Enter BikePart Sale Price
        double salesPrice = Double.parseDouble(enterBikePart.split(",")[3]);
        //Enter BikePart is On Sale
        boolean onSale = Boolean.parseBoolean(enterBikePart.split(",")[4]);
        //Enter BikePart Quantity
        int quantity = Integer.parseInt(enterBikePart.split(",")[5]);
        BikePart bikePartObject = new BikePart(partName, partNumber, listPrice, salesPrice, onSale, quantity );
        Main.mainWarehouse.getBikeParts().add(bikePartObject);
        return bikePartObject;
    }

    /**
     * Method doSell
     */

    /*
     *This method allows the user to enter in the part number and if the part is found, then the information
     * will be displayed. If the part is not found, then the message will display "part number not found!".
     */
    public static String doSell(String sellBikePart) {

        int partNumber = Integer.parseInt(sellBikePart);

        boolean Found = false;
        Date date = new Date();
        int i = 0;
        while (i < Main.mainWarehouse.getBikeParts().size() && !Found) {

            if (Main.mainWarehouse.getBikeParts().get(i).getPartNumber() == (partNumber)) {
                Found = true;
                if (Main.mainWarehouse.getBikeParts().get(i).getOnSale()) {
                    //Part is on sale this is the sales price and the quantity
                    return Main.mainWarehouse.getBikeParts().get(i).getPartName() + " " + Main.mainWarehouse.getBikeParts().get(i).getSalesPrice() + " " + Main.mainWarehouse.getBikeParts().get(i).getSoldQuantity() + " " + date;
                } else if (Main.mainWarehouse.getBikeParts().get(i).getOnSale()) {
                    //Part is not on sale this is the list price
                    return Main.mainWarehouse.getBikeParts().get(i).getPartName() + " " + Main.mainWarehouse.getBikeParts().get(i).getListPrice() + " " + Main.mainWarehouse.getBikeParts().get(i).getSoldQuantity() + " " + date;
                }
            }
            i += 1;
        }
        if (!Found) {
        }
        return ("Part Number Not Found!");
    }

    /**
     * Method doDisplay
     */

    /*
     * This allows for the user to enter in a bike part name and get back the part name, list price, and sales price.
     */
    public static String doDisplay(String displayBikePart) {

        String partName = displayBikePart;

        boolean Found = false;
        int j = 0;

        while (j < Main.mainWarehouse.getBikeParts().size() && !Found) {

            if (Main.mainWarehouse.getBikeParts().get(j).getPartName().equals(partName)) {
                Found = true;
                if (Main.mainWarehouse.getBikeParts().get(j).getOnSale()) {
                    //Part Name is on sale this is the sales price
                    return (Main.mainWarehouse.getBikeParts().get(j).getPartName() + " " + Main.mainWarehouse.getBikeParts().get(j).getSalesPrice());
                } else if (!Main.mainWarehouse.getBikeParts().get(j).getOnSale()) {
                    //Part Name is not on sale this is the list price
                    return(Main.mainWarehouse.getBikeParts().get(j).getPartName() + " " + Main.mainWarehouse.getBikeParts().get(j).getListPrice());
                }
            }
            j += 1;
        }

        if (!Found) {
        }
        return("Part Name Not Found!");
    }


    public static String doSortName(){
        Collections.sort(Main.mainWarehouse.getBikeParts(), new Comparator<BikePart>() {
            @Override
            public int compare(BikePart B1, BikePart B2) {
                return B1.getPartName().compareTo(B2.getPartName());
            }
        });

        String part = "";
        for(BikePart s : Main.mainWarehouse.getBikeParts())
        {
            part = part + s.toString() +  "\n";
        }
        return part;
    }

    public static String doSortNumber(){
        Collections.sort(Main.mainWarehouse.getBikeParts(), new Comparator<BikePart>() {
            @Override
            public int compare(BikePart B1, BikePart B2) {
                if( B1.getPartNumber() > (B2.getPartNumber())) {
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        String part = "";
        for(BikePart s : Main.mainWarehouse.getBikeParts())
        {
            return (part = part + s.toString() + "\n");
        }
        return part;
    }
}