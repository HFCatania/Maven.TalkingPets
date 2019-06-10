package io.zipcoder.polymorphism;

public class Cat extends Pets{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String speak) {
        super(name, speak);
        this.speak = "meow";
    }
    @Override
    public void speak() {
        System.out.println("meowth");
    }
}
