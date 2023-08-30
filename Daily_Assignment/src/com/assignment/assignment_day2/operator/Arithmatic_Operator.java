package com.assignment.assignment_day2.operator;

import java.util.Scanner;

public class Arithmatic_Operator {
    public static void main(String[] args) {
//        1. Enter two numbers and do the following arithmetic Operations find max and min.
//        i) a+b*c ii) c+a/b
//        iii) a%b+c iV) a*b+c
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        int max = Math.max(a, b);
        System.out.println("Max: " + max);
        int min = Math.min(a, b);
        System.out.println("Min : " + min);
        int c = a + b;
        int d = a + b * c;
        System.out.println("The value for a+b*c= " + d);
        int e = c + a / b;
        System.out.println("The value for c+a/b= " + e);
        int f = a % b + c;
        System.out.println("The value for a%b+c= " + f);
        int g = a * b + c;
        System.out.println("The value for a*b+c= " + g);
//        if (a>b){
//            System.out.println("a is max");
//            System.out.println("b is min");
//        }
//        else {
//            System.out.println("b is max");
//            System.out.println("a is min");
//        }

    }
}
