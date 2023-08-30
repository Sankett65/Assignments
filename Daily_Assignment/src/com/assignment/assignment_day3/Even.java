package com.assignment.assignment_day3;

public class Even {
//    5) Java Program to print the elements of an array present on an even position

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        for (int i=1;i< arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
