package com.sortingalgorithms;



public class SelectionSortScores {

    public static void main(String[] args) {

        int[] scores = {78, 45, 90, 32, 88, 67};

        selectionSort(scores);

        System.out.println("Sorted Exam Scores (Ascending): ");
        for (int s : scores) {
            System.out.print(s + " ");
        }
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
