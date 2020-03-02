package com.epam.tasks;
import java.awt.print.Book;
import java.util.Comparator;

public class SortByPublisher implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String p1 = ((Book) o1).getPublisher();
        String p2 = ((Book) o2).getPublisher();
        return p1.compareTo(p2);
    }
}

