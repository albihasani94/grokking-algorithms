package com.albin.grokking.chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    void sortsCorrectly() {
        int[] input = {5, 2, 8, 1, 9, 3};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8, 9}, output);
    }

    @Test
    void handlesAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, output);
    }

    @Test
    void handlesReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, output);
    }

    @Test
    void handlesArrayWithDuplicates() {
        int[] input = {5, 2, 8, 5, 9};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{2, 5, 5, 8, 9}, output);
    }

    @Test
    void handlesEmptyArray() {
        int[] input = {};
        int[] output = selectionSort.sort(input);
        assertEquals(0, output.length);
    }

    @Test
    void handlesSingleElementArray() {
        int[] input = {42};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{42}, output);
    }

    @Test
    void handlesTwoElements() {
        int[] input = {9, 1};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{1, 9}, output);
    }

    @Test
    void handlesNegativeNumbers() {
        int[] input = {-5, -2, -8, -1};
        int[] output = selectionSort.sort(input);
        assertArrayEquals(new int[]{-8, -5, -2, -1}, output);
    }

}
