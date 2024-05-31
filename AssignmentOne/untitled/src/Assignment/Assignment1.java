package Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        task4();
    }

    static void task1() {
        //create instance of scanner object
        Scanner sc = new Scanner(System.in);
        //ask player how many elements theyd like to create
        System.out.println("How many elements would you like to create?");
        //intake int
        int amount = sc.nextInt();
        //use int to create object array of that size
        Object[] array = new Object[amount];
        //bool to end future while loop
        boolean allEntered = false;
        //index to keep track of the loop
        int index = 0;

        //ask player to populate area being sure to alter data type depending
        //on if it matches the criteria of said data type
        while(!allEntered) {
            System.out.println("please enter element " + index + " into the array");
            int input = sc.nextInt();
            if(input == 1) {
                array[index++] = true;
            } else if(input == 0){
                array[index++] = false;
            }else if (input >= -128 && input <= 127){
                array[index++] = (byte)input;
            } else if (input >= -32768 && input <= 32767) {
                array[index++] = (short)input;
            } else {
                array[index++] = input;
            }
            if(index > array.length - 1) {
                allEntered = true;
                System.out.println("allentered");
            }
        }

        //this is just here for you to test it. It doesn't say to print the results in the instructions
        /*
        for (Object item : array) {
            System.out.println(item);
        }
        */
    }

    static void task2(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    static void task3(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int index = 0;

        for (int item : arr) {
            System.out.println("please enter element " + index + " into the array");
            arr[index++] = sc.nextInt();
        }
        task2(arr);
    }

    static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements would you like to create?");
        int amount = sc.nextInt();

        int[] array = new int[amount];

        task3(array);
    }
}
