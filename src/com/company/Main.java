package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


    }
}




/*
public class koka {
    // Kokar vattnet?
    Scanner input = new Scanner(System.in);
        while (true){
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


public class bada{
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

public class hasttokig(){
Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        if (age < 12){
            System.out.println("Du är för ung för att tävla!");
        }
        else if (age >= 12){
            System.out.println("Vikt: ");
            int vikt = scanner.nextInt();

            if (vikt <= 30){
                System.out.println("A-ponny");
            }
            else if (vikt <= 50){
                System.out.println("B-ponny");

            }else if (vikt <= 65){
                System.out.println("C-ponny");

            }else if (vikt > 65){
                System.out.println("Det finns inga ponnys för denna viktklass");
            }
            System.out.println();
        }

}

public class middag1 () {

Scanner scanner = new Scanner(System.in);
        System.out.print("Vad är det för dag? ");
        String dag = scanner.nextLine();

        switch (dag) {
            case "Måndag":
                System.out.println("Kyckling");
            case "Tisdag":
                System.out.println("Pannkaka");
            case "Onsdag":
                System.out.println("Ärtsoppa");
            case "Torsdag":
                System.out.println("Gryta");
            case "Fredag":
                System.out.println("Kalv");
            case "Lördag":
                System.out.println("Vegetariskt");
            case "Söndag":
                System.out.println("Kålsoppa");

        }
    }
}


public class middag2 () {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad är det för dag? ");
        String dag = scanner.nextLine();

        switch (dag) {
            case "Måndag":
                System.out.println("Kyckling");
            case "Tisdag":
                System.out.println("Pannkaka");
            case "Onsdag":
                System.out.println("Ärtsoppa");
            case "Torsdag":
                System.out.println("Gryta");
            case "Fredag":
            case "Lördag":
            case "Söndag":
                System.out.println("Kålsoppa");
                break;

        }
}

public class Fragesport () {
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

public class for-loop () {
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            temp = temp + i;
            System.out.println(temp);
        }
}

public class farinvasion () {

        int numberOfSheep = 4;
        int monthsToPrint = 12;

        for (int monthNumber = 1; monthNumber < monthsToPrint; monthNumber++ ){
            numberOfSheep = numberOfSheep * 4;
            System.out.println("There will be " + numberOfSheep + " after " + monthNumber +
            " month(s)");

        }

}

public class jamnatal

    int i = 0;

        while (i<=10)
        {
            if (i % 2 == 0)
            {
                System.out.print(i);
            }
            i++;
        }
}

public class looping

    for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}

public class mjau

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

public class sort1

    int [] array = {45, 23, -5, 12};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        };
    }
}

public class sort2

    String [] array = {"string" , "hej", "what", "wordsyo"};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        };
    }
}

public class multiply

     public static void main(String[] args) {

        System.out.println(multiply(8,4));

    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}

public class calculate {


        System.out.println(calculate(8, 4, 2));

    }

    public static int calculate(int x, int y, int p) {
        return x * y / p;
    }
}

public class stringchecker

    public static void main(String[] args) {

        String s = "Strängen du matade in är 14 tecken lång";

        System.out.println(s);
    }
}

public class stringextractor

    public static void main(String[] args) {

        String s = "Goodbye World";

        System.out.println(s.toUpperCase());
    }
}

public class array {

    public static void main(String[] args) {

        int num[]={23, 45, 54, 12, 77};

        System.out.println(num[0]);
        System.out.println(num[4]);
    }
}



*/