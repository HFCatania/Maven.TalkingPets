package io.zipcoder.polymorphism;

public class Dog extends Pets {

    public Dog() {
    }

    public Dog(String name, String speak) {
        super(name, speak);

    }

    public Dog(String name) {
        super(name);

    }
    @Override
    public void speak() {
        System.out.println("woof");
    }
}


