package com.company;

import java.util.Scanner;

public class mjau {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;
        int mjau = 0;

        System.out.println("Hur många mjau vill du ha?");
        answer = scanner.nextLine();

        while (true) {
            if (mjau == 3) {
                System.out.println("mjau mjau mjau");
            }
            if (mjau == 4) {
                System.out.println("mjau mjau mjau mjau");
            }
            if (mjau == 0) {
                System.out.println("avslutas");
            }
            break;
        }
    }
}
