package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("1111111111", "Book One", "Description of Book One", 100, new ArrayList<>(List.of("Author One"))));

        this.books.add(new Book("2222222222", "Book Two", "Description of Book Two", 150, new ArrayList<>(List.of("Author Two"))));

        this.books.add(new Book("3333333333", "Book Three", "Description of Book Three", 120, new ArrayList<>(List.of("Author Three"))));

        this.books.add(new Book("4444444444", "Book Four", "Description of Book Four", 200, new ArrayList<>(List.of("Author Four"))));

        this.books.add(new Book("5555555555", "Book Five", "Description of Book Five", 180, new ArrayList<>(List.of("Author Five"))));
    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }

}
