package com.assignment.assignment_day2.forloop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int num = 0;
        for (;n!=0;){
            int remainder = n%10;
            num = (num*10) + remainder;
            n = n/10;
        }
        System.out.println("Reverse is: "+num);
    }
}
