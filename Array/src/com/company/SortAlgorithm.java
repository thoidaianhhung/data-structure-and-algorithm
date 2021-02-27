package com.company;

public class SortAlgorithm {

    public SortAlgorithm() {}

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int[] arrCopy = new int[n];
        System.arraycopy(arr, 0, arrCopy, 0, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrCopy[j] > arrCopy[j + 1]) {
                    int temp = arrCopy[j];
                    arrCopy[j] = arrCopy[j + 1];
                    arrCopy[j + 1] = temp;
                }
            }
        }
        printArray(arrCopy);
    }

    public void selectionSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (b[j] < b[min_index]) {
                    min_index = j;
                }
            }
            int temp = b[i];
            b[i] = b[min_index];
            b[min_index] = temp;
        }
        printArray(b);
    }

    public void insertionSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        for (int i = 1; i < n; i++) {
            int key = b[i];
            int j = i - 1;

            while (j >= 0 && b[j] > key) {
                b[j + 1] = b[j];
                j = j - 1;
            }
            b[j + 1] = key;
        }
        printArray(b);
    }
}
