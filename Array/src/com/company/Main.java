package com.company;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("1. Bubble Sort.");
        System.out.println("2. Selection Sort.");
        System.out.println("3. Insertion Sort.");
        System.out.println("4. Quick Sort.");
    }

    public static void main(String[] args) {
	    // write your code here
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        Scanner input = new Scanner(System.in);
        System.out.print("Import N element: ");
        int n = Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Import element arr[" + i + "] : ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        while (true) {
            showMenu();
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> sortAlgorithm.bubbleSort(arr);
                case 2 -> sortAlgorithm.selectionSort(arr);
                case 3 -> sortAlgorithm.insertionSort(arr);
                case 4 -> sortAlgorithm.quickSort(arr);
            }
        }
    }
}
