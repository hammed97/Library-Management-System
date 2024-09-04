package org.example.entity;

public class Book {
    private String author;
    private String title;
    private String id;
    private Integer quantity;

    public Book(String author, String title, String id, Integer quantity) {
        this.author = author;
        this.title = title;
        this.id = id;
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
