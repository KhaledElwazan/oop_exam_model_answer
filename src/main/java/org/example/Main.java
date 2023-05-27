package org.example;

import java.util.ArrayList;

public class Main {

    public static boolean search(ArrayList<LibraryItem> libraryItems, String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {


        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

//        generate 20 books
        for (int i = 0; i < 20; i++) {
            libraryItems.add(Book.fake());
        }

//        generate 20 fake DVDs
        for (int i = 0; i < 20; i++) {
            libraryItems.add(DVD.fake());
        }

        for (LibraryItem libraryItem : libraryItems) {
            libraryItem.displayDetails();
        }


    }
}