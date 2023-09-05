package com.assignment.assignment_day5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum =1;
        for (int i =1;i<=n;i++){
            sum = sum * i;
            System.out.println(i+"! ="+sum);
        }
    }
}
