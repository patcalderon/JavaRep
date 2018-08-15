package com.company;

import java.util.Scanner;

public class koka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            int numb = input.nextInt();

            int vattentemp = numb;

            if (vattentemp == 100) {
                System.out.println("Vattnet kokar");
            } else if (vattentemp == 50) {
                System.out.println("Det är halvvägs nu!");
            } else {
                System.out.println("Vattnet kokar inte");
            }
        }
    }
}
