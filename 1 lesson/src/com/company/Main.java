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

    public static boolean chk_digit(int z) {
        if (z < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void printTypeDigit(boolean v, int z){
        if (v){
            System.out.println("Число " + z + " отрицательное");
        }
        else {
            System.out.println("Число " + z + " положительное");
        }
    }

    public static void printMyName(String txtToPrint){
        System.out.println("Привет, " + txtToPrint);
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
        int     c, y, z; ;
        long    d = 1048576L;
        float   e = 12.3f;
        double  f = 15.72d;
        boolean g, v;
        char    h = 'A';
        String  txtToPrint;


        // constant
        final int x = 20;

        c = 1048576;
        g = true;
        y = 2017;
        z = -120;
        txtToPrint = "Олег";

        //Вывод результата арифметических действий
        System.out.println("calculate = " + calculate(a, b, c, d));

        //Вывод результата проверка в каком диапазоне находится сумма чисел
        System.out.println("chk_sum = " + chk_sum(a, b));

        //Проверка на весокосный год
        if (chk_leap_year(y)){
            System.out.println(y + " весокосный год" );
        }
        else {
            System.out.println(y + " обыкновенный год" );
        }

        //Вывод имени в консоль
        printMyName(txtToPrint);

        //Проверка отрицательное или положительное число было передано
        System.out.println("chk_digit = " + chk_digit(z));

        //Вывод положительное или отрицательное число
        printTypeDigit(chk_digit(z), z);
    }
}
