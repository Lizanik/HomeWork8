package com.epam.tasks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int i=4;
        Book b1 = new Book(1, "Flowers forAlgernon", "Daniel Keys ", "Harcourt,Brace&World", 1959, 311, 20);
        Book b2 = new Book(2, "1984", "George Orwell", "Secker&Warbug", 1949, 328, 25);
        Book b3 = new Book(3, "One Flew Over the Cuckoo's Nest", "Ken Kesey", "Viking Press&Signet Books", 1962, 320, 35);
        Book b4 = new Book(4, "The Minds of Billy Milligan", "Daniel Keyes", "Random House", 1982, 374, 45);
        Books books = new Books(i);
        books.addBook(b1);
        books.addBook(b2);
        books.addBook(b3);
        books.addBook(b4);
        books.printBooks();
        System.out.println("Enter percent to reprice ");
        books.changePrice(sc.nextInt());
        books.printBooks();
        System.out.println("Enter author to view book");
        Scanner str = new Scanner (System.in);
        String line = str.nextLine();
        Books authorBooks = books.findByAuthor(line);
        authorBooks.printBooks();
        System.out.print("Enter publication year ");
        Scanner st = new Scanner (System.in);
        int year = st.nextInt();
        Books yearBooks = books.findByYear(sc.nextInt());
        yearBooks.printBooks();
    }
}