package com.assignment.assignment_day5;

public class Swap {
    public static void main(String[] args) {
        int a = 45;
        int b = 100;
        System.out.println("Before Swaping: ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
