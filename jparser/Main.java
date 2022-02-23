package jparser;
import java.util.ArrayList;
import java.io.File;

public class Main {
    public final ArrayList <Item> allItems = new ArrayList <>();
    public final File DIR_ITEMS = new File("data/items");

    public static void main(String args[]) {
        Item test = new Item("01", "Bananas", "Edible", 12f, 16f);
        System.out.println("Hello world");
        System.out.println(test.toString());
    }

    ArrayList <Item> loadItems(String DIR_ITEMS) {
        ArrayList <Item> finList = new ArrayList <Item>();
        // check if there are any items
        // If there are, return the item
        // if not, return '-1'
        return finList;
    }
}

