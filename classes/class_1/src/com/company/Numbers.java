package com.company;

public class Numbers {

    int a;
    int b;

    public void printNumbers() {
        int a = this.a;
        int b = this.b;
        System.out.println(" firs number " + a);
        System.out.println(" second number " + b);
    }

    public void sum() {
        int a = this.a;
        int b = this.b;
        System.out.println("sum of numbers " + (a + b));
    }

    public void findBigNumber() {
        int a = this.a;
        int b = this.b;

        if (a > b) {
            System.out.println(a + " larges than " + b);
        } else {
            System.out.println(b + " larges than " + a);
        }
    }


}
