package com.assignment.assignment_day3;

public class SecondLargest {

//    10) Find 2nd Largest Number in an Array

    public static void main(String[] args) {
//
//        String1 s1 = "Goutham";
//        String1 s2="Goutham";
//        System.out.println(s1==s2);
//        String1 s3 = new String1("Goutham");
//        System.out.println(s1==s3);


        String s1="Sanket";
        String s2 = s1;
        String s3 = new String("Sanket");
        String s4 = new String("Sanket");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
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
