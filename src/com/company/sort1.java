package com.company;

import java.util.Arrays;

public class sort1 {

    public static void main(String[] args) {

        int [] array = {45, 23, -5, 12};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        };
    }
}
