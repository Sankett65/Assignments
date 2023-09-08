package com.assignment.assignment_day6;

public class Reverse {
    public static void main(String[] args) {
        int n = 123456;
        int temp =n;
        int sum =0;
        while (n!=0){
            int x =  n%10;
            sum = (sum*10) + x;
            n = n/10;
        }
        System.out.println("Reverse of number "+temp+" is :-"+sum);
    }
}
