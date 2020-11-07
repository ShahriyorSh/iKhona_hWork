package com.company.Counter;

public class Counter {

    public int counter ;

    public Counter(int counterFrom) {
            counter = counterFrom;
    }

   public void PlusCounter() {
        counter++;
        System.out.println(counter);
    }

    public void minusCounter() {
        if (counter >= 0) {
            counter--;
            System.out.println(counter);
        }
    }

    public  void getNumber(){
        System.out.println(this.counter);
    }
}
