package com.sortingalgorithms;


public class InsertionSortEmployee {

    public static void main(String[] args) {

        int[] employeeIds = {104, 55, 201, 76, 150, 89};

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs (Ascending): ");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
