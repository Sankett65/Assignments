package com.assignment.assignment_day2.whileloop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i =0;
        int num =0;
        while (i<n){
            int remainder = n%10;
            num = (num*10) + remainder;
            n = n/10;

        }
        System.out.println("Reverse is: "+num);
    }
}
