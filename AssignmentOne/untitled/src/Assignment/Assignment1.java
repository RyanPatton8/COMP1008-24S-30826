package Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        task4();
    }

    static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements would you like to create?");

        int amount = sc.nextInt();

        Object[] array = new Object[amount];
        boolean allEntered = false;
        int index = 0;

        while(!allEntered) {
            System.out.println("please enter element " + index + " of the array");
            int input = sc.nextInt();
            if(index > array.length - 1) {
                allEntered = true;
            } else if(input == 1) {
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
        }
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
            System.out.println("please enter element " + index + " of the array");
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
