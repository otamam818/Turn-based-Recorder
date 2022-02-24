package jparser;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Main {
    public final ArrayList <Item> allItems = new ArrayList <>();
    public static final File DIR_ITEMS = new File("data/items");

    public static void main(String args[]) {
        System.out.println("Hello world");
        getItems();
    }

    private static String[] getItems() {
        for (File currentFile : DIR_ITEMS.listFiles()) {
            String fileName = currentFile.getName();
            boolean isItemFile = !fileName.equals("README.md");
            if (isItemFile) {
                addItem();
            }
        }
        return new String[3];
    }
    private void addItem(String fileName) {
        new Thread() {
            public void run() {
                // Variables for the Item class
                String ID = fileName, name, description;
                float minCostRange, maxCostRange;

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
                            // Item name
                        }
                        else if (lineNumber == 2) {
                            // Description
                        }
                        else if (lineNumber == 3) {
                            // Price
                        }
                        else if (lineNumber == 4) {
                            // Times bought
                        }
                    }
                }

                catch (FileNotFoundException e) {
                }
            }
        }
    }
}

