/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, answer1, answer2, answer3, answer4, answer5;
        String r1 = "EGG", r2 = "CANDLE", r3 = "SPONGE", r4 = "FUTURE", r5 = "PROMISE";

        Scanner bogart = new Scanner(System.in);
        System.out.println("Welcome to Kent's riddles");
        System.out.print("Enter your name: ");
        name = bogart.next();
        System.out.println("Hello " + name + ", Read the Instructions carefully");
        System.out.println("***************************************************");
        System.out.println("1. Answer in all caps");
        System.out.println("   Example: BOGART");
        System.out.println("2. Wrong spelling wrong");
        System.out.println("3. You only have 3 lives");
        System.out.println("   so answer carefully");
        System.out.println("***************************************************");
for(int i = 3; i > 0; i++){
        System.out.println("Riddle 1.");
        System.out.print("What has to be broken before you can use it?: ");
        answer1 = bogart.next();
        if (answer1.equals(r1)) {
            System.out.println("Correct");
        } else {
            System.out.println("wrong");
        }
        System.out.println("lives remaining: " + i);

        System.out.println("Riddle 2.");
        System.out.print("I’m tall when I’m young, and I’m short when I’m old. What am I?: ");
        answer2 = bogart.next();
        if (answer2.equals(r2)) {
            System.out.println("Correct");
        } else {
            System.out.println("wrong");
        }
        System.out.println("lives remaining: " + i);

        System.out.println("Riddle 3.");
        System.out.print("What is full of holes but still holds water?: ");
        answer3 = bogart.next();
        if (answer3.equals(r3)) {
            System.out.println("Correct");
        } else {
            System.out.println("wrong");
        }
        System.out.println("lives remaining: " + i);

        System.out.println("Riddle 4.");
        System.out.print("What is always in front of you but can’t be seen?: ");
        answer4 = bogart.next();
        if (answer4.equals(r4)) {
            System.out.println("Correct");
        } else {
            System.out.println("wrong");
        }
        System.out.println("lives remaining: " + i);

        System.out.println("Riddle 5.");
        System.out.println("What can you break, even if you never pick it up or touch it?: ");
        answer5 = bogart.next();
        if (answer5.equals(r5)) {
            System.out.println("Correct");
        } else {
            System.out.println("wrong");
        }
        System.out.println("lives remaining: " + i);
    }
    }
}

