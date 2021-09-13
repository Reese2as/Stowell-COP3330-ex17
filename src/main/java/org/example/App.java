/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int gender, hours, weight;
        double BAC, TAC, ratio = 0;

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        gender = user_input.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        TAC = user_input.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        weight = user_input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        hours = user_input.nextInt();

        if (gender == 1) {
            ratio = 0.73;
        }
        if (gender == 2) {
            ratio = 0.66;
        }

        BAC = (TAC * 5.14 / weight * ratio) - 0.015 * hours;

        System.out.println(String.format("\nYour BAC is %.6f", BAC));
        System.out.println(BAC >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.");
    }
}
