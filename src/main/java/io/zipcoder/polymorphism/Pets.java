package io.zipcoder.polymorphism;

public class Pets {
    String name = "";
    String speak = "";
    String type = "";

    public Pets() {
    }

    public Pets(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void speak(){

    }
    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

}
