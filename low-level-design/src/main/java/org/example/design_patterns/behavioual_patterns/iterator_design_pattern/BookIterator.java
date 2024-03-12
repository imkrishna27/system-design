package org.example.design_patterns.behavioual_patterns.iterator_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookIterator implements Aggregate{
    List<Book> bookList = new ArrayList<>();
    BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }
    @Override
    public Iterator createIterator() {
        return new Book(bookList);
    }
}
