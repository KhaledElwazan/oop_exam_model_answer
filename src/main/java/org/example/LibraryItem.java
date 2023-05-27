package org.example;

public  abstract class LibraryItem extends Item{

    private boolean availability;

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
