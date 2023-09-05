package com.assignment.assignment_day5;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet: ");
         char n = sc.nextLine().charAt(0);

        switch (n) {
            case 'a' -> System.out.println("It is an Vowel");
            case 'e' -> System.out.println("It is an Vowel");
            case 'i' -> System.out.println("It is an Vowel");
            case 'o' -> System.out.println("It is an Vowel");
            case 'u' -> System.out.println("It is an Vowel");
            default -> System.out.println("It is an Constatnt");
        }
    }
}
