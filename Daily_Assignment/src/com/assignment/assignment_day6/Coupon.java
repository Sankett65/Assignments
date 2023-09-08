package com.assignment.assignment_day6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Coupon {
    public static void main(String[] args) {
        int n =10;
        int a=10;
        int count=0;
        Set couponNumber=new HashSet<>();
        Random r = new Random();
        while (couponNumber.size() <n) {
            count++;
            int x = r.nextInt(n);
            if (!couponNumber.contains(x)){
                couponNumber.add(x);
                System.out.println("The Coupon number is :- "+x);
            }
        }
        System.out.println("Total Coupon Number Genetrated :- "+count);
    }
}
