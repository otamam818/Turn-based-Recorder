package jparser;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static final ArrayList <Item> allItems = new ArrayList <>();
    public static final File DIR_ITEMS = new File("data/items");

    public static void main(String args[]) {
        System.out.println("Hello world");
        getItems();
    }

    private static void getItems() {
        for (File currentFile : DIR_ITEMS.listFiles()) {
            String fileName = currentFile.getName();
            boolean isItemFile = !fileName.equals("README.md");
            if (isItemFile) {
                addItem(fileName);
            }
        }
    }

    private static void addItem(String fileName) {
        new Thread() {
            public void run() {
                // Variables for the Item class
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
                    allItems.add(new Item(ID, itemName, description, 
                                 minCostRange, maxCostRange, timesBought));
                }

                catch (FileNotFoundException e) {
                    // Log the exception
                }
            }
        }.start();
    }
}

