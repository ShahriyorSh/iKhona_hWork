package com.company;

public class Numbers {

    public int a;
    public int b;

    public void printNumbers() {
        System.out.println(" firs number " + a);
        System.out.println(" second number " + b);
    }

    public void sum() {
        System.out.println("sum of numbers " + (a + b));
    }

    public void findBigNumber() {
        if (a > b) {
            System.out.println(a + " larges than " + b);
        } else {
            System.out.println(b + " larges than " + a);
        }
    }


}
