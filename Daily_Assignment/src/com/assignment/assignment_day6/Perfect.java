package com.assignment.assignment_day6;

public class Perfect {
    public static void main(String[] args) {
        int n =28;
        int sum=0;
        for (int i =1;i<n;i++){
            if (n % i ==0){
                sum = sum + i;
               // System.out.println(i);
            }
        }
        if (sum==n){
            System.out.println("The Number is Perfect Number");
        }else {
            System.out.println("The Number is not a Perfect Number");
        }
    }
}
