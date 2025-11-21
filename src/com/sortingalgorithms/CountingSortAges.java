package com.sortingalgorithms;


public class CountingSortAges {

    public static void countingSort(int[] a) {
        int max = 18;
        int min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[a.length];

        for (int i = 0; i < a.length; i++)
            count[a[i] - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = a.length - 1; i >= 0; i--) {
            output[count[a[i] - min] - 1] = a[i];
            count[a[i] - min]--;
        }

        for (int i = 0; i < a.length; i++)
            a[i] = output[i];
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 13, 15, 11, 14};
        countingSort(ages);
        for (int age : ages) System.out.print(age + " ");
    }
}
