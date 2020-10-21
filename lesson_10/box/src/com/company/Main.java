package com.company;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
        box.height = 40;
        box.width = 60;
        box.material = "Plastic";
        box.weight = 100;

        Box box2 = new Box();
        box2.height = 20;
        box2.width = 20;
        box2.material = "Derevo";
        box2.weight = 30;

//        System.out.println(box2.height);
//        System.out.println(box2.width);
//        System.out.println(box2.material);
//        System.out.println(box2.weight);

    }


}

class Box {
    double height;
    double width;
    String material;
    double weight;
}