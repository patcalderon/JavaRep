package com.company;

import java.util.Scanner;

public class hasttokig {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 12) {
            System.out.println("Du är för ung för att tävla!");
        } else if (age >= 12) {
            System.out.println("Vikt: ");
            int vikt = scanner.nextInt();

            if (vikt <= 30) {
                System.out.println("A-ponny");
            } else if (vikt <= 50) {
                System.out.println("B-ponny");

            } else if (vikt <= 65) {
                System.out.println("C-ponny");

            } else if (vikt > 65) {
                System.out.println("Det finns inga ponnys för denna viktklass");
            }
            System.out.println();
        }
    }
}
