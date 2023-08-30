package com.assignment.assignment_day2.whileloop;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i =1;
        int sum =0;
        while (i<=n) {
            sum = sum + i;
            System.out.print("+" +i);
            i++;
        }
        System.out.println(" ");
        System.out.println("The sum of " + n + " natural number is: " + sum);
    }
}
