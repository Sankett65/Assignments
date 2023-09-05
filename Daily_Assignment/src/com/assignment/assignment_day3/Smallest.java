package com.assignment.assignment_day3;

public class Smallest {
//    4) Java Program to print the smallest element in an array

    public static void main(String1[] args) {
        int[] arr ={2,5,3,7,5,1};
        int min = Integer.MAX_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}


