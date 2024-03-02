package org.example.Task1;

public class Papers extends Publication implements Authors{
    private String author;
    public Papers(int id, String title) {
        super(id, title);

    }


    public Papers(int id, String title, String author) {
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
