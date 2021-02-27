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

    public void sort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public void quickSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        int high = b.length - 1;
        sort(b, 0, high);
        printArray(b);
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
