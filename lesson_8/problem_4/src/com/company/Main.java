package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 88, 5, 4, 3222, 3};
        System.out.println(getMaxNumberFromArray(array));

    }

    public static int getMaxNumberFromArray(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
