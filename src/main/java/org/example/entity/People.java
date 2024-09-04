package org.example.entity;

public class People extends Base {
    String position;

    public People(String name, Integer age, Level level, String bookRequestTitle, Integer bookRequestQuantity, String position) {
        super(name, age, level, bookRequestTitle, bookRequestQuantity);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
