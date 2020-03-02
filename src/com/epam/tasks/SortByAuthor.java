package com.epam.tasks;
import com.epam.tasks.Book;
import java.util.Comparator;
public class SortByAuthor implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String a1 = ((Book) o1).getPublisher();
        String a2 = ((Book) o2).getPublisher();
        return a1.compareTo(a2);
    }
}
