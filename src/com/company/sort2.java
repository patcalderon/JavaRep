package com.company;

import java.util.Arrays;

public class sort2 {

    public static void main(String[] args) {

        String [] array = {"string", "hej", "what", "wordsyo"};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        };
    }
}
