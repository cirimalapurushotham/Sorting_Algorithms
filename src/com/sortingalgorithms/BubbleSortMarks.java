package com.sortingalgorithms;



public class BubbleSortMarks {

    public static void main(String[] args) {

        int[] marks = {78, 45, 89, 32, 90, 55};

        bubbleSort(marks);

        System.out.println("Sorted Marks (Ascending): ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
