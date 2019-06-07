package io.zipcoder.polymorphism;

public class Pets {
    String name = "";
    String speak = "";

    public Pets() {
    }

    public Pets(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
