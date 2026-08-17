package com.albin.grokking.chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static final int[] MY_LIST = {1, 3, 5, 7, 9};

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void findsExistingItem() {
        assertEquals(1, binarySearch.search(MY_LIST, 3));
    }

    @Test
    void returnsNullWhenItemMissing() {
        assertEquals(-1, binarySearch.search(MY_LIST, -1));
    }

    @Test
    void findsFirstAndLastElements() {
        assertEquals(0, binarySearch.search(MY_LIST, 1));
        assertEquals(4, binarySearch.search(MY_LIST, 9));
    }
}
