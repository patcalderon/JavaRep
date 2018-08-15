package com.company;

import java.util.Scanner;

public class middag1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad är det för dag? ");
        String dag = scanner.nextLine();

        switch (dag) {
            case "Måndag":
                System.out.println("Kyckling");
                break;
            case "Tisdag":
                System.out.println("Pannkaka");
                break;
            case "Onsdag":
                System.out.println("Ärtsoppa");
                break;
            case "Torsdag":
                System.out.println("Gryta");
                break;
            case "Fredag":
                System.out.println("Kalv");
                break;
            case "Lördag":
                System.out.println("Vegetariskt");
                break;
            case "Söndag":
                System.out.println("Kålsoppa");
                break;
        }
    }
}
