package com.epam.tasks;

import java.util.InputMismatchException;

public class Books {
    private Validator validator = new Validator();
    private com.epam.tasks.Book[] books;
    private int bookCount = 0;

    public Books(int size) {
        books = new com.epam.tasks.Book[size];
    }

    public void addBook(com.epam.tasks.Book book) {
        if (bookCount == books.length) {
            return;
        }
        books[bookCount++] = book;
    }

    public void printBooks() {
        for (Book elem : books) {
            elem.view();
        }
    }

    public void changePrice(int percents) throws InputMismatchException {
        validator.InputMismatchException;
        for (int i = 0; i < bookCount; i++) {
            books[i].setPrice(books[i].getPrice() + books[i].getPrice() / 100 * percents);
        }
    }

    public Books findByAuthor(String author) {
        Books Author = new Books(books.length);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
            }
        }
        return Author;
    }

    public Books findByYear(int year) {
        Books Year = new Books(books.length);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getYear() > year) {
            }
        }
        return Year;
    }
}
