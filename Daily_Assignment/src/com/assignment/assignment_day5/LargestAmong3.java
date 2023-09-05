package com.assignment.assignment_day5;

public class LargestAmong3 {
    public static void main(String[] args) {
        int x = 3;
        int y =5;
        int z = 9;
        if (x>y && x>z){
            System.out.println(x+" is thr laregest amongst "+x+","+y+","+z);
        } else if (y>x && y>z) {
            System.out.println(y+" is thr laregest amongst "+x+","+y+","+z);
        }else {
            System.out.println(z+" is thr laregest amongst "+x+","+y+","+z);

        }

    }
}
