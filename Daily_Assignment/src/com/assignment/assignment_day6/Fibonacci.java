package com.assignment.assignment_day6;

public class Fibonacci {
    public static void main(String[] args) {
        int x =0;
        int y = 1;
        int z = x+y;
        int n = 7;
        System.out.print("Fibonacci Series: ");
        System.out.print(x+ " " +y+" ");
        for (int i =1;i<n;i++){
            z= x+y;
            x=y;
            y=z;
           System.out.print(z+" ");
        }

    }

}
