package io.zipcoder.polymorphism;

public class Dog extends Pets {

    public Dog() {
    }

    public Dog(String name, String speak) {
        super(name, speak);
        this.speak = "woof";
    }

    public Dog(String name) {
        super(name);

    }

}


