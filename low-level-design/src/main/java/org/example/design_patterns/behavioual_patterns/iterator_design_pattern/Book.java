package org.example.design_patterns.behavioual_patterns.iterator_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Book implements Iterator {
    private String bookName;
    private Long bookPrice;
    private List<Book> books = new ArrayList<>();

    private int currentIndex=0;
    public Book(List<Book> bookList) {
        this.books = bookList;
    }
    public Book(String bookName,Long bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean hasNext() {
        if(currentIndex<books.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            return books.get(currentIndex++);
        }
        return null;
    }
}
