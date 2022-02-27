package jparser;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static final File DIR_ITEMS = new File("data/items");

    public static void main(String args[]) {
        ArrayList <Item> allItems = new ArrayList <>();
        System.out.println("Hello world");
        getItems(allItems);
    }

    private static void getItems(ArrayList <Item> allItems) {
        for (File currentFile : DIR_ITEMS.listFiles()) {
            String fileName = currentFile.getName();
            boolean isItemFile = !fileName.equals("README.md");
            if (isItemFile) {
                Item newItem = new Item(fileName);
                allItems.add(newItem);
            }
        }
        System.out.println(allItems);
    }

}

