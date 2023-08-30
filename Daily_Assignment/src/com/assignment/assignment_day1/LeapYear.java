package com.assignment.assignment_day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int a = sc.nextInt();
        if (a%4==0){
            System.out.println("Year is Leap year");
        }else {
            System.out.println("Year is not a leap year");
        }
    }
}
