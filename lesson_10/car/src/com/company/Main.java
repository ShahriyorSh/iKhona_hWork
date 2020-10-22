package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "Range Rover";
        car1.year = 1970;
        car1.color = "White";
        car1.type = "SUV";

        Car car2 = new Car();
        car2.name = "Rolls roys";
        car2.year = 1904;
        car2.color = "White";
        car2.type = "SUV";

        Car car3 = new Car();
        car3.name = "Opel";
        car3.year = 1994;
        car3.color = "Green";
        car3.type = "Caravan";





   /*     System.out.println("Название : " + car1.name);
        System.out.println("Год основания : " + car1.year);
        System.out.println("Цвет : " + car1.color);
        System.out.println("Тип : " + car1.type);
*/


     /* System.out.println("Название : " + car2.name);
        System.out.println("Год основания : " + car2.year);
        System.out.println("Цвет : " + car2.color);
        System.out.println("Тип : " + car2.type);*/

    }
}

class Car {
    String name;
    int year;
    String color;
    String type;
}