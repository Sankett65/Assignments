package com.assignment.assignment_day1;

public class StaticVariable {

    static int a = 20;
    static int b = 10;

    static void add(){
        int c = a +b;
        System.out.println("Addition= " + c);
    }
    static void sub(){
        int d = a-b;
        System.out.println("Subtraction= " +d);
    }

    public static void main(String[] args) {
        add();
        sub();
    }
}
