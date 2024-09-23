package com.practice.java.Lambda.dao;

import com.practice.java.Lambda.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book>  books = new ArrayList<>();
        books.add(new Book(101,"Python",200));
        books.add(new Book(102,"Jython",200));
        return books;
    }
}
