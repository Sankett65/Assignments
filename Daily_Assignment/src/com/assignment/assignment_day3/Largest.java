package com.assignment.assignment_day3;

public class Largest {

//    3) Java Program to print the largest element in an array

    public static void main(String[] args) {
        int[] arr = {2,5,1,4,7,9};
        int max = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largest Element is: "+max);
    }
}
