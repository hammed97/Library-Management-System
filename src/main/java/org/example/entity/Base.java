package org.example.entity;

public abstract class Base {
    private String name;
    private Integer age;
    private Level level;
    private String bookRequestTitle;

    Integer bookRequestQuantity;

    public Base(String name, Integer age, Level level, String bookRequestTitle, Integer bookRequestQuantity) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.bookRequestTitle = bookRequestTitle;
        this.bookRequestQuantity = bookRequestQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getBookRequestTitle() {
        return bookRequestTitle;
    }

    public void setBookRequestTitle(String bookRequestTitle) {
        this.bookRequestTitle = bookRequestTitle;
    }

    public Integer getBookRequestQuantity() {
        return bookRequestQuantity;
    }

    public void setBookRequestQuantity(Integer bookRequestQuantity) {
        this.bookRequestQuantity = bookRequestQuantity;
    }

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                ", bookRequestTitle='" + bookRequestTitle + '\'' +
                ", bookRequestQuantity=" + bookRequestQuantity +
                '}';
    }
}
