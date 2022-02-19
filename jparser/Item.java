package jparser;

/* Parses Items and sorts them by name */
public class Item {
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

    public Item (String Name, String Description, float minCostRange, float maxCostRange) {
        this.Name         = Name;
        this.Description  = Description;
        this.minCostRange = minCostRange;
        this.maxCostRange = maxCostRange;
    }

    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}

