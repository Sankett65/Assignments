package com.assignment.assignment_day2.ifelse;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
            //Read a Number 1,10,100,1000 and display unit, ten hundred
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n==1){
                System.out.println("Units : 1");
                System.out.println("Tens : 0");
                System.out.println("Hundred : 0");
                System.out.println("Thouand : 0");
            } else if (n==10) {
                System.out.println("Units : 0");
                System.out.println("Tens : 1");
                System.out.println("Hundred : 0");
                System.out.println("Thousand : 0");
            } else if (n==100) {
                System.out.println("Units : 0");
                System.out.println("Tens : 0");
                System.out.println("Hundred : 1");
                System.out.println("Thousand : 0");
            } else if (n==1000) {
                System.out.println("Units : 0");
                System.out.println("Tens : 0");
                System.out.println("Hundred : 0");
                System.out.println("Thousand : 1");
            }else {
                System.out.println("Invalid Number");
            }
        }
    }


