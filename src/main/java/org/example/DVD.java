package org.example;

import com.github.javafaker.Faker;

public class DVD extends LibraryItem implements Reservable{

    final private String director;
    final private int duration;

    public DVD(String title, int itemID, String author, int numPages) {
        this.setTitle(title);
        this.setItemID(itemID);
        this.director = author;
        this.duration = numPages;
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", duration=" + duration +
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

    public static DVD fake(){
        Faker faker = new Faker();
        var himym = faker.howIMetYourMother();

        return new DVD(himym.quote(), faker.number().randomDigit(), himym.character(), faker.number().randomDigit());
    }
}
