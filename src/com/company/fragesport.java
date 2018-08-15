package com.company;

import java.util.Scanner;

public class fragesport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;
        int points = 0;

        System.out.println("Frågesport!");
        System.out.println();
        System.out.print("Namn: ");
        String name = scanner.nextLine();


        System.out.println("Fråga 1: Vad är Sveriges huvudstad?");
        answer = scanner.nextLine();

        if(answer.equals("Stockholm")){
            points++;
            System.out.println(points);
        }

        System.out.println("Fråga 2: Är himlen blå?");
        answer = scanner.nextLine();
        if (answer.equals("Ja")){
            points++;
            System.out.println(points);
        }

        System.out.println("Fråga 3: Vad är Englands huvudstad?");
        answer = scanner.nextLine();
        if (answer.equals("London")) {
            points++;
        }
        System.out.println("Fråga 4: Hur många invånare har Sverige?");
        answer = scanner.nextLine();
        if (answer.equals("10 miljoner")) {
            points++;
        }

        System.out.println("Fråga 5: Hur många kanter har en kvadrat?");
        answer = scanner.nextLine();
        if (answer.equals("4")) {
            points++;
        }

        if( points == 0) {
            System.out.println("This is a sad day for sports");
        }else if(points < 3){
            System.out.println(name + " won bronze! ");
        }else if(points < 5 ){
            System.out.println(name + " won silver! ");
        } else if (points == 5) {
            System.out.println("Wow, " + name + " went gold!");
        }
    }
}
