package io.zipcoder.polymorphism;

public class Child extends Pets {
    public Child() {
    }

    public Child(String name) {
        super(name);
    }

    public Child(String name, String speak) {
        super(name, speak);
        this.speak = "waaaah";
    }
}
