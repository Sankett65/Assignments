package com.assignment.assignment_day1;

import java.util.Scanner;

public class CommandLine_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a =sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum of two number is : " + c);
    }
}
