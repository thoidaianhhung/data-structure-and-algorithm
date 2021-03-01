package com.company;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("1. Bubble Sort.");
        System.out.println("2. Selection Sort.");
        System.out.println("3. Insertion Sort.");
        System.out.println("4. Quick Sort.");
        System.out.println("5. Merge Sort.");
        System.out.println("6. Shell Sort.");
        System.out.println("7. Counting Sort.");
        System.out.println("8. Radix Sort.");
        System.out.println("9. Heap Sort");
        System.out.println("0. Exit");
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
                case 5 -> sortAlgorithm.mergeSort(arr);
                case 6 -> sortAlgorithm.shellSort(arr);
                case 7 -> sortAlgorithm.countingSort(arr);
                case 8 -> sortAlgorithm.radixSort(arr);
                case 9 -> sortAlgorithm.heapSort(arr);
                default -> System.exit(0);
            }
        }
    }
}
