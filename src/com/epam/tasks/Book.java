
package com.epam.tasks;

public class Book {
    private int ID;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int quantityPages;
    private double price;

    public Book(int ID, String name, String author, String publisher, int year, int quantityPages, int price) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantityPages = quantityPages;
        this.price = price;
    }
    public void view() {
        System.out.println("id = "+ ID + ", name: " + name
                + ", author: " + author + ", publisher: " + publisher
                + ", year = " + year + ", pages = " + quantityPages + ", price = " + price);
    }
    @Override
    public String toString() {
        String Info = "Book " + ID + "\n" +
                "--------\n" +
                "title: " + name + "\n" +
                "author: " + author + "\n" +
                "publisher: " + publisher + "\n" +
                "year of the publication: " + year + "\n" +
                "number of pages: " + quantityPages + "\n" +
                "price:" + price;
        return Info;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int QuantityPages) {
        this.quantityPages = quantityPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
