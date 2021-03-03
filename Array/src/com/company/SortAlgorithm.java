package com.company;

import java.util.Arrays;

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
            printArray(arrCopy);
        }

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
            printArray(b);
        }

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
            printArray(b);
        }

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

    public void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        if (n1 >= 0) System.arraycopy(arr, l, L, 0, n1);

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int k = l;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public void mergeSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        mergeSort(b, 0, n - 1);
        printArray(b);
    }

    public void shellSortSolution(int[] arr) {
        int n = arr.length;
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= h && arr[j - h] > temp; j -= h) {
                    arr[j] = arr[j - h];
                }
                arr[j] = temp;

            }
        }
    }

    public void shellSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        shellSortSolution(b);
        printArray(b);
    }

    public void countingSortSolution(int[] arr) {
        int n = arr.length;
        char[] output = new char[n];
        int[] count = new int[256];

        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        for (int j : arr) {
            ++count[j];
        }

        for (int i = 1; i <= 255; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = (char) arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public void countingSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        countingSortSolution(b);
        printArray(b);
    }

    public int getMax(int[] arr, int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (mx < arr[i]) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i>= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            --count[(arr[i] / exp) % 10];
        }

        if (n >= 0) System.arraycopy(output, 0, arr, 0, n);
    }

    public void radixSortSolution(int[] arr, int n) {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    public void radixSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        radixSortSolution(b, n);
        printArray(b);
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void buildMaxHeap(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[(i - 1) / 2]) {
                int j = i;
                while (arr[j] > arr[(j - 1) / 2]) {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    public void heapSortSolution(int[] arr, int n) {
        buildMaxHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, i, 0);
            int j = 0, index;
            do {
                index = 2 * j + 1;
                if (index < i - 1 && arr[index] < arr[index + 1]) {
                    index++;
                }
                if (index < i && arr[j] < arr[index]) {
                    swap(arr, j, index);
                }
                j = index;

            } while (index < i);
        }
    }

    public void heapSort(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        heapSortSolution(b, n);
        printArray(b);
    }
}
