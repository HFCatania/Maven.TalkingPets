package io.zipcoder.polymorphism;

public class Pets {
    String name = "";
    String speak = "";
    String type = "";

    public Pets() {
    }

    public Pets(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public Pets(String name) {
        this.name = name;
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

}
