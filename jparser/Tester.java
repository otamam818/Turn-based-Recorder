package jparser;

/* Tests all implemented classes */
public class Tester {
    public static void main(String args[]) {
        System.out.println("Testing: Item Constructor");
        Item test = new Item("01", "Bananas", "Edible", 12f, 16f);
        System.out.println(test.toString());
    }
}
