package com.assignment.assignment_day5;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want the 2 table : ");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
           int sum = 2 * i;
            System.out.println("2 X "+i+" ="+sum);
        }

    }
}
