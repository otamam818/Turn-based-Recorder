package jparser;

public class Item {
    private String Name;
    private String Description;
    private float minCostRange;
    private float maxCostRange;
    private int timesBought;

    public Item (String Name, String Description, float minCostRange, float maxCostRange) {
        this.Name = Name;
        this.Description = Description;
        this.minCostRange = minCostRange;
        this.maxCostRange = maxCostRange;
    }

    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}

