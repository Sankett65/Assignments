package com.assignment.assignment_day2.operator;

import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter the day: ");
        int d = sc.nextInt();
        boolean c = (m==3 && d>=20) || (m==4 && d>0 && d<=31) || (m==5 && d>0 && d<=31) || (m==6 && d<=20);
        System.out.println(c);
    }
}
