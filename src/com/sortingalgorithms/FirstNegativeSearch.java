package com.sortingalgorithms;



public class FirstNegativeSearch {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 0, 7, -4, 9};
        int index = findFirstNegative(nums);
        System.out.println(index);
    }
}
