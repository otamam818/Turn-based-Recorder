package jparser;

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
            float maxCostRange) {
        this.ID           = ID;
        this.Name         = Name;
        this.Description  = Description;
        this.minCostRange = minCostRange;
        this.maxCostRange = maxCostRange;
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

