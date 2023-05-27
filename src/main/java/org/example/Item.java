package org.example;

public abstract class Item {

    private String title;
    private int itemID;


    public abstract void displayDetails();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
