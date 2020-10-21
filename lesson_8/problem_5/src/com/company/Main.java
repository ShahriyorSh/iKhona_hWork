package com.company;

public class Main {

    public static void main(String[] args) {
// eto 6 dz
        int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumOfArray(someArray));
    }

    public static int sumOfArray(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

}
