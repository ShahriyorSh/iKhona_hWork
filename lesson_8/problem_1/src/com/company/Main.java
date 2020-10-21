package com.company;

public class Main {

    public static void main(String[] args) {

        //problem_2
        int a = maxNumber(14, 120);
        System.out.println(a);
    }

    public static int maxNumber(int x, int y) {
        if (x > y) return x;
        else return y;

    // return Math.max(x, y); idea предлагает это
    }

}
