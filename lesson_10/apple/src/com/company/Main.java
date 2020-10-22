package com.company;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();

        apple.grade = "Vlyams Prayd";
        apple.color = "Red";
        apple.sour = "No";


        Apple apple2 = new Apple();

        apple2.grade = "Antonovka";
        apple2.color = "Green";
        apple2.sour = "Da";


    /*    System.out.println("Сорт : " + apple.grade);
        System.out.println("Колор : " + apple.color);
        System.out.println("Кислое : " + apple.sour);*/

    }


}

class Apple {
    String grade;
    String color;
    String sour;
}
