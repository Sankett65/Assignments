package com.assignment.assignment_day2.operator;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        double a = sc.nextDouble();
        System.out.print("Enter b value : ");
        double b = sc.nextDouble();
        System.out.print("Enter c value : ");
        double c = sc.nextDouble();
        double d = (b * b) - (4.0 * a * c);
        if (d > 0.0) {
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (d < 0.0) {
            d = d * (-1);
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("The root of the following quadratic equation is " + root1 + " and " + root2);

        }
    }

}
