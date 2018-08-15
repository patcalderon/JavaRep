package com.company;

public class farinvasion {

    public static void main(String[] args) {

        int numberOfSheep = 4;
        int monthsToPrint = 12;

        for (int monthNumber = 1; monthNumber < monthsToPrint; monthNumber++) {
            numberOfSheep = numberOfSheep * 4;
            System.out.println("There will be " + numberOfSheep + " after " + monthNumber +
                    " month(s)");
        }
    }
}

