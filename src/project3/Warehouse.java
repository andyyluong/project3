package project3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Warehouse class contains information about a warehouse
 * @author brianJustice
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author alexLundin
 */
public abstract class Warehouse implements Serializable
{
    protected ArrayList<Inventory> inventoryWarehouse;
    protected String name;
    protected WarehouseType warehouseType;

    /**
     * Warehouse constructor
     * @param name Name of warehouse
     * @param warehouseType Warehouse type
     */
    public Warehouse(String name, WarehouseType warehouseType)
    {
        inventoryWarehouse = new ArrayList<>();
        this.name = name;
        this.warehouseType = warehouseType;
    }


    /**
     * Get warehouse type
     * @return Warehouse type
     */
    public WarehouseType getType()
    {
        return warehouseType;
    }

    public String read(String filename) {
        ArrayList<Inventory> invList = new ArrayList<>();
        String retString = new String();
        File input = new File(filename);
        try {
            Scanner read = new Scanner(input);
            while(read.hasNextLine()) {
                String line = read.nextLine();
                String regularExpression = "\\s*(\\s|,)\\s*";
                String[] bpWH = line.split(regularExpression);
                System.out.println(Arrays.toString(bpWH));
                Inventory inv = new Inventory(new BikePart(bpWH[0], Integer.parseInt(bpWH[1]), Double.parseDouble(bpWH[2]), Double.parseDouble(bpWH[3])), Boolean.parseBoolean(bpWH[4]), Integer.parseInt(bpWH[5]));
                invList.add(inv);
                retString += inv.toString() + "\n";

            }

            return retString;
        }

        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        return "File Not Found 2";

    }

    public String update(String filename, ArrayList<Inventory> inventoryWarehouse) {
            try {
                PrintWriter writer = new PrintWriter(filename, "UTF-8");
                for (Inventory inv : inventoryWarehouse)
                    writer.println(inv);
                writer.close();
            }   catch (IOException e) {
                System.out.println("file error!");
                e.printStackTrace();
            }
            return filename;
        }

    //public Inventory findInventoryByName(String name);

    //public Inventory findInventoryByNumber(int number);

    //public void addInventory(String part);

    //public void sell(int partNumber, int amount);

    public String sortName()
    {
        String sort = "";
        Collections.sort(inventoryWarehouse, new InventoryComparatorByName());
        for(Inventory i: inventoryWarehosue)
        {
            sort += i.toString() + "\n";
        }
        return sort;
    }
    
    public String sortNumber()
    {
        String sort = "";
        Collections.sort(inventoryWarehouse, new InventoryComparatorByNumber());
        for(Inventory i: inventoryWarehouse)
        {
            sort += i.toString() + "\n";
        }
        return sort;
    }

    public String getName() {
        return name;
    }

    public Inventory getInventory(String name) {
        Inventory inventory = null;
        for(Inventory i: inventoryWarehouse){
            if(name.equals(i.getName())){
                inventory = i;
            }
            if(name.equals(String.valueOf(i.getNumber()))){
                inventory = i;
            }
        }
        return inventory;
    }
}
