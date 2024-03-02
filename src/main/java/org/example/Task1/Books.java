package org.example.Task1;


public class Books extends Publication implements Authors {
    private String author;

    public Books(int id, String title) {
        super(id, title);

    }

    public Books(int id, String title, String author) {
        this(id, title);
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


