package com.assignment.assignment_day2.forloop;

import java.util.Scanner;

public class Natural {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int sum =0;
            for (int i =0;i<=n;i++){
                sum = sum + i ;
                System.out.print("+" +i);
            }
            System.out.println(" ");
            System.out.println("Sum of "+n+" Natural number is: "+sum);
        }

}
