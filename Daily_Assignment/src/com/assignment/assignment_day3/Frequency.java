package com.assignment.assignment_day3;

public class Frequency {
//    2) Java Program to find the frequency of each element in the array

    public static void main(String1[] args) {
        int[] arr = {1,2,1,3,4,2,5,3,6,4,2,1};
        boolean[] frequency =new  boolean[arr.length];
        System.out.println("________");
        for (int i =0;i< arr.length;i++){
            if (frequency[i]==true)
                continue;
            int count =0;
            for (int j =0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    frequency[j]=true;
                }
            }
            System.out.println("| "+arr[i]+" | "+count+" |");
            System.out.println("________");
        }
    }
}
