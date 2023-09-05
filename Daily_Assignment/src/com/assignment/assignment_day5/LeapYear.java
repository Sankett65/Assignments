package com.assignment.assignment_day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int n = sc.nextInt();
        if (n %4==0){
            System.out.println(n +" is Leap Year");
        }else {
            System.out.println(n+" is not a Leap Year");
        }
    }
}
