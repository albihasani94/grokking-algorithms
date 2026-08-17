package com.albin.grokking.chapter01;

public class BinarySearch {

    public int search(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        int guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = array[mid];
            if (guess == item) {
                return mid;
            } else if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
