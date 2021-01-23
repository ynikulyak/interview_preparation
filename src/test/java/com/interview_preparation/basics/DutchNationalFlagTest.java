package com.interview_preparation.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DutchNationalFlagTest {

    int[] actual = new int[]{2,0,2,1,1,0};
    int[] expected = new int[]{0, 0, 1, 1, 2, 2};

    int[] actual2 = new int[]{2,0,1};
    int[] expected2 = new int[]{0, 1, 2};

    int[] actual3 = new int[]{0};
    int[] expected3 = new int[]{0};

    int[] actual4 = new int[]{1};
    int[] expected4 = new int[]{1};

    int[] actual5 = new int[]{};
    int[] expected5 = new int[]{};

    @Test
    public void testSortColors(){
        DutchNationalFlag.sortColors(actual);
        assertArrayEquals(expected, actual);

        DutchNationalFlag.sortColors(actual2);
        assertArrayEquals(expected2, actual2);

        DutchNationalFlag.sortColors(actual3);
        assertArrayEquals(expected3, actual3);

        DutchNationalFlag.sortColors(actual4);
        assertArrayEquals(expected4, actual4);

        DutchNationalFlag.sortColors(actual5);
        assertArrayEquals(expected5, actual5);
    }
}
