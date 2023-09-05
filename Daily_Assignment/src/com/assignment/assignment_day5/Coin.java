package com.assignment.assignment_day5;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to toss the coin: ");
        int n = sc.nextInt();
        int counthead=0;
        int counttail=0;

        for (int i =1;i<=n;i++) {
            double check = Math.random();
            if (check < 0.5) {
                System.out.println("Heads");
                counthead++;
            } else {
                System.out.println("Tails");
                counttail++;
            }
        }
        System.out.println("The percentage of Heads is: "+(counthead*100)/n);
        System.out.println("The percentage of Tails is: "+(counttail*100)/n);
    }
}
