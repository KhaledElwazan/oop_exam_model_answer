package org.example;

import com.github.javafaker.Faker;

public class Book extends LibraryItem implements Reservable {

    final private String author;
    final private int numPages;

    public Book(String title, int itemID, String author, int numPages) {
        this.setTitle(title);
        this.setItemID(itemID);
        this.author = author;
        this.numPages = numPages;
    }


    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", numPages=" + numPages +
                '}';
    }

    @Override
    public boolean reserve() {
        if (super.isAvailability()) {
            super.setAvailability(false);
            return true;
        }
        return false;
    }

    public static Book fake() {
        Faker faker = new Faker();
        var book = faker.book();
        return new Book(book.title(), faker.number().randomDigit(), book.author(), faker.number().randomDigit());
    }

}
