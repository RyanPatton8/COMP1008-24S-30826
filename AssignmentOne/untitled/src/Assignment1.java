import java.io.Console;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements would you like to create?");

        int amount = sc.nextInt();

        int[] array = new int[amount];
        boolean allEntered = false;
        int index = 0;

        while(!allEntered) {
            if(index >= amount) {
                allEntered = true;
            } else {
                array[index++] = sc.nextInt();
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
