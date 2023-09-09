package com.assignment.assignment_day3;

public class SecondLargest {

//    10) Find 2nd Largest Number in an Array

    public static void main(String[] args) {

        int [] arr ={1,4,2,5,6,9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
        }
       // System.out.println(secondMax);

    }
}
