package org.example.entity;

public class Libarian {
    private String name;

    public Libarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Libarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
