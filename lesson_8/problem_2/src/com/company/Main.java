package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfSquares(2,6));
    }

    public static int sumOfSquares(int x, int y) {
        int i;
        int res = 0;
        for (i = x; i <= y; i++) {
            res += i * i;
        }
        return res;
    }
}
