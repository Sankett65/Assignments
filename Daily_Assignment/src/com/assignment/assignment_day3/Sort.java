package com.assignment.assignment_day3;

public class Sort {
//    9) Java Program to sort the elements of an array in ascending order

    public static void main(String[] args) {
        int [] arr = {2,5,1,4,7,6,8,9,3};
        System.out.println("Before Sorting:");
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        for (int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

}
