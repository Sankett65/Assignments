package com.assignment.assignment_day3;

public class Duplicate {

//    8) Java Program to print the duplicate elements of an array

    public static void main(String[] args) {
        int arr [] = {1,3,2,4,5,6,1,5,2,6};
        for (int i =0;i< arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

}