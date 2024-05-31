package Assignment;

public class HouseRunner {
    public static void main(String[] args) {
        House average = new House((short)2380,(byte) 2, "Basement");
        House mansion = new House((short) 30000,(byte) 80, "Dungeon");
        House tree = new House((short) 30,(byte) 0, "In the heart of the woods");

        System.out.println("average Square Feet: " + average.getSquareFootage());
        System.out.println("average Washroom Amount: " + average.getWashroomAmount());
        System.out.println("average Safe Location: " + average.getSafeLocation());

        System.out.println("mansion Square Feet: " + mansion.getSquareFootage());
        System.out.println("mansion Washroom Amount: " + mansion.getWashroomAmount());
        System.out.println("mansion Safe Location: " + mansion.getSafeLocation());

        System.out.println("tree Square Feet: " + tree.getSquareFootage());
        System.out.println("tree Washroom Amount: " + tree.getWashroomAmount());
        System.out.println("tree Safe Location: " + tree.getSafeLocation());
    }
}
