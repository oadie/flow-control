package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
        if(condicion) {
        } else if() {
        } else {}
        */

        //kinda propmt in js
        //Scanner declaración de objeto
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("type your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("type your name");
        String name = sc.nextLine();
        sc.nextLine();

        if(age > 17) {
            System.out.println("congrats " + name + ", you are legal");
        }else{
            System.out.println(name + " you are not legal, yet");
        }

        sc.close();
    */


        // tres ángulos y determinar si el triangulo es viable
    /*
        Scanner abc = new Scanner(System.in);
        System.out.println("type angle A");
        int a = abc.nextInt();

        System.out.println("type angle B");
        int b = abc.nextInt();

        System.out.println("type angle C");
        int c = abc.nextInt();

        if ((a+b+c)==180) {
            System.out.println("valid angles");
        } else {
            System.out.println("invalid inputs");
        }

        abc.close();
    */

    /*
        Scanner ab = new Scanner(System.in);
        System.out.println("type angle A");
        int A = ab.nextInt();

        System.out.println("type angle B");
        int B = ab.nextInt();

        int C = 180 - (A+B);
        System.out.println("last angle should be " + C);

        ab.close();
     */

    /*
        Scanner leap = new Scanner(System.in);
        System.out.println("type a year number to know if it is leap");
        int year = leap.nextInt();

        int secular = year % 100;
        int fourSecular = year % 400;

        if ((year % 4 == 0) && (secular != 0) || (fourSecular == 0 )) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println( year + " is not a leap year");
        }

        leap.close();
     */

     /*
        Scanner select = new Scanner(System.in);
        System.out.println("type number a");
        float numA = select.nextInt();
        System.out.println("type number b");
        int numB = select.nextInt();
        System.out.println("type the case number for each math operation:\n 1) sum\n 2) rest\n 3) multiplication\n 4) division");
        int math = select.nextInt();
        select.nextLine();
        float outcome = 0;

        switch (math) {
            case 1:
                outcome = numA + numB;
                break;
            case 2:
                outcome = numA - numB;
                break;
            case 3:
                outcome = numA * numB;
                break;
            case 4:
                outcome = numA / numB;
                break;

        default:
            System.out.println("number of case don't admitted");
        }

        System.out.println("outcome: " + outcome);
        select.close();
     */

        Scanner day = new Scanner(System.in);
        System.out.println("type the case number for each week day:\n" +
                " 1) Monday\n 2) Tuesday\n 3) Wednesday\n 4) Thursday\n 5) Friday\n 6) Saturday\n 7) Sunday");
        int numberDay = day.nextInt();
        day.nextLine();
        String outcome = "";

        switch (numberDay) {
            case 1:
                outcome = "Monday";
                break;
            case 2:
                outcome = "Tuesday";
                break;
            case 3:
                outcome = "Wednesday";
                break;
            case 4:
                outcome = "Thursday";
                break;
            case 5:
                outcome = "Friday";
                break;
            case 6:
                outcome = "Saturday";
                break;
            case 7:
                outcome = "Sunday";

            default:
                System.out.println("number of case don't admitted");
        }

        System.out.println("outcome: " + outcome);
        day.close();
    }
}
