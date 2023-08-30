package com.assignment.assignment_day2.forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int temp = n;
        int num = 0;
        for (;n!=0;){
            int remainder= n%10;
            num = (num*10) + remainder;
            n = n/10;
        }
        if (temp==num){
            System.out.println("Enter number is a palindrome number");
        }
        else {
            System.out.println("Enter number is not a palindrome number");
        }
    }
}
