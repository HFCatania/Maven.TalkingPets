package io.zipcoder.polymorphism;

public class Pets implements Comparable<Pets> {
    String name = "";
    String speak = "";
    String type = "";

    public Pets() {
    }

    public Pets(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void speak() {

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

    @Override
    public int compareTo(Pets o) {
        if (this.name.toLowerCase().compareTo(o.name.toLowerCase()) > 0) {
            return 1;
        } else if (this.name.toLowerCase().compareTo(o.name.toLowerCase()) < 1) {
            return -1;
        } else {
            if (this.type.compareTo(o.type) > 0) {
                return 1;
            } else if (this.type.compareTo(o.type) < 1) {
                return -1;
            } else
                return 0;

        }
    }
}
