package com.assignment.assignment_day6;

import java.util.Scanner;

public class Stopwatch {

    public static long start1;
    public static void start(){
         start1 =System.currentTimeMillis();
        System.out.println("Time is Started");
    }

    public static long stop(){
        long stop1= System.currentTimeMillis();
        System.out.println("Time is Stop");
        return stop1;
    }

    public static long time(){
        long timing= System.currentTimeMillis()-start1;
        return timing;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter (1:-start) (2:-stop)");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    start();
                    System.out.println("Start Timing :- 0 millisecond");
                    break;
                case 2:
                    stop();
                    long elcapsedtime = time();
                    System.out.println("End Timing is : "+time() + " millisecond");
                    System.exit(0);
            }
        }

    }
}
