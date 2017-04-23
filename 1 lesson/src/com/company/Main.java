package com.company;

/*
    Created by Kuznetsov Oleg on 22.04.2017
 */


public class Main {

    public static long calculate(byte a, short b, int c, long d){
        return a * (b + (c / d));
    }

    public static boolean chk_sum(byte a, short b) {
        if (a + b >= 10) {
            if (a + b <= 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean chk_leap_year(int y){
        if (y%4 == 0) {
            if (y%400 == 0) {
                return true;
            }
            else {
                    if (y%100 == 0) {
                        return false;
                    }
                    else {
                        return true;
                    }
                 }
            }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // declare variables
        byte    a = 1;
        short   b = 32767;
        int     c, y; ;
        long    d = 1048576L;
        float   e = 12.3f;
        double  f = 15.72d;
        boolean g = true;
        char    h = 'A';

        // constant
        final int x = 20;

        c = 1048576;
        y = 2017;

        System.out.println("calculate = " + calculate(a, b, c, d));
        System.out.println("chk_sum = " + chk_sum(a, b));

        if (chk_leap_year(y)){
            System.out.println(y + " весокосный год" );
        }
        else {
            System.out.println(y + " обыкновенный год" );
        }
    }
}
