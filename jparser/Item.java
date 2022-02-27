package jparser;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/* Parses Items and sorts them by name */
public class Item {
    // The filename of the item; its unique identifier
    private String ID;
    // The name of the item
    private String Name;
    // information describing the item
    private String Description;
    // Its minimum cost range from the available alternatives
    private float minCostRange;
    // Its maximum cost range from the available alternatives
    private float maxCostRange;
    // The number of times this item is bought
    private int timesBought;

    public Item (String ID, String Name, String Description, float minCostRange, 
            float maxCostRange, int timesBought) {
        this.ID           = ID;
        this.Name         = Name;
        this.Description  = Description;
        this.minCostRange = minCostRange;
        this.maxCostRange = maxCostRange;
        this.timesBought  = timesBought;
    }

    public Item (String fileName) {
        // Variables declared and initialized for the Item class
        String ID = fileName, 
               itemName = null, 
               description = null;
        float minCostRange = -1f, maxCostRange = -1f;
        int timesBought = -1;
        final String SEPARATOR = " \\| ";

        /* open the file and read each line 
         * as described in the README
        */
        int lineNumber = 1;

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String itemData = fileReader.nextLine();

                if (lineNumber == 1) {
                    itemName = itemData;
                }

                else if (lineNumber == 2) {
                    description = itemData;
                }

                else if (lineNumber == 3) {
                    String[] items = itemData.split(SEPARATOR);
                    minCostRange = Float.parseFloat(items[0]);
                    maxCostRange = Float.parseFloat(items[1]);
                }

                else if (lineNumber == 4) {
                    timesBought = Integer.parseInt(itemData);
                }
                lineNumber++;
            }

            // Add Item to ArrayList based on variables obtained
            
        }

        catch (FileNotFoundException e) {
            // Log the exception
        }

        new Item(ID, itemName, description, minCostRange, maxCostRange, 
                 timesBought);
    }

    public static void main(String args[]) {
        System.out.println("Hello world");
    }

    public String toString() {
        // Initialize variables
        String result = "";
        int i;
        final String SEPARATOR = " \\| ";
        String[] items = {
            this.ID,
            this.Name,
            this.Description,
            Float.toString(this.minCostRange),
            Float.toString(this.maxCostRange),
        };

        // Append every item to the result while separating them
        for (i = 0; i < items.length - 1; i++) {
            result += items[i];
            result += SEPARATOR;
        }
        result += items[i];
        return result;
    }
}

