package com.company;

import java.util.Scanner;

public class bada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Finns det vatten? ");
            boolean vatten = input.nextBoolean();
            System.out.println("Hur många grader är vattnet? ");
            int grader = input.nextInt();

            if (vatten && (grader > 30)){
                System.out.println("Varsågod och bada!");
            }
            else if (!vatten || (grader < 30)){
                System.out.println("Det går inte att bada.");
            }
            System.out.println();
        }
    }
}
