package com.practice.java.Lambda.service;

import com.practice.java.Lambda.Book;
import com.practice.java.Lambda.dao.BookDAO;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBookingSort() {
        List<Book> bookList = new BookDAO().getBooks();
        Collections.sort(bookList, (b1, b2) -> b1.getName().compareTo(b2.getName()));
            return bookList;


        /*new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        }*/
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookingSort());
    }
}

//class MyComparator implements Comparator<Book> {
//    @Override
//    public int compare(Book b1, Book b2){
//        return b1.getName().compareTo(b2.getName());
//    }
