package org.example.design_patterns.behavioual_patterns.iterator_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book-1",12l));
        books.add(new Book("book-2",14l));
        books.add(new Book("book-3",16l));
        books.add(new Book("book-4",18l));
        books.add(new Book("book-5",20l));
        BookIterator bookIterator = new BookIterator(books);
        Iterator iterator = bookIterator.createIterator();
        while (iterator.hasNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next.getBookName()+" "+next.getBookPrice());
        }
    }
}
