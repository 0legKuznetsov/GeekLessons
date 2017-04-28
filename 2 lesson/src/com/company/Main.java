package com.company;

import java.util.Arrays;

public class Main {

    public static void changeArray() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        System.out.print("before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println();
        System.out.println("after: " + Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[8];
        int x = 0;

        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                arr[i] = x;
            } else {
                arr[i] = x += 3;
            }
        }
        System.out.println("fill: " + Arrays.toString(arr));
    }

    public static void multipleArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("multiple: " + Arrays.toString(arr));
    }

    public static void createTwoDimensionalArray() {
        int[][] twoDimensional = new int[8][8];

        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                if (twoDimensional[i] == twoDimensional[j]) {
                    twoDimensional[i][j] = 1;
                }
                System.out.print(twoDimensional[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMinMaxElementOfArray() {
        int[] arr = {23, -45, 1, 67, 2, 178, 14, 36};
        int arrMin = 0;
        int arrMax = 0;
        int i = 0;

        while (i < arr.length) {
            if (i == 0) {
                arrMin = arr[i];
            } else {
                if (arr[i] <= arrMin) {
                    arrMin = arr[i];
                } else {
                    if (arr[i] >= arrMax) {
                        arrMax = arr[i];
                    }
                }
            }
            i = i+1;
        }
        System.out.println("arrMin = " + arrMin);
        System.out.println("arrMax = " + arrMax);
    }

    public static boolean checkBalanceOfArray(int[] array){
        int firstElement = 0;
        int sum = 0;
        int pos = 0;
        boolean result = false;

        for(int i = 0; i < array.length; i++){
            firstElement = firstElement + array[i];
            pos = i;
            sum = 0;
            for(int j = pos + 1; j < array.length; j++){
                sum = sum + array[j];
            }
            if(firstElement == sum){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void moveByPosArray(int[] array, int n){
        System.out.println("before array: " + Arrays.toString(array));
        if (n > 0){
            for (int i = 0; i < Math.abs(n); i++){
                int x = array[array.length - 1];
                for (int j = array.length-1; j > 0; j--){
                    array[j] = array[j - 1];
                }
                array[0] = x;
            }
        }  else {
            for (int i = 0; i < Math.abs(n); i++){
                int x = array[0];
                for (int j = 0; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = x;
            }
        }
        System.out.println("after array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        // 1 point of Homework
        System.out.println("1 point of Homework");
        changeArray();
        System.out.println();

        // 2 point of Homework
        System.out.println("2 point of Homework");
        fillArray();
        System.out.println();

        // 3 point of Homework
        System.out.println("3 point of Homework");
        multipleArray();
        System.out.println();

        // 4 point of Homework
        System.out.println("4 point of Homework");
        createTwoDimensionalArray();
        System.out.println();

        // 5 point of Homework
        System.out.println("5 point of Homework");
        findMinMaxElementOfArray();
        System.out.println();

        // 6 point of Homework
        System.out.println("6 point of Homework");
        int[] arr = {-2, 3, 5, 6};
        System.out.println("checkBalanceOfArray = " + checkBalanceOfArray(arr));
        System.out.println();

        // 7 point of Homework
        System.out.println("7 point of Homework");
        int[] array = {-2, 3, 5, 6, 123, 76, -24};
        int n = 2;
        moveByPosArray(array, n);
    }
}