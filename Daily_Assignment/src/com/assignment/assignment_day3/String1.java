package com.assignment.assignment_day3;

public class String1 {
    public static void main(String[] args) {
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

    }
}
