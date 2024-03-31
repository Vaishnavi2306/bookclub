package com.bookclub.service;

import java.util.List;

import com.bookclub.model.Book;

public interface GenericDao<E,K> {
	List<Book> list();
	Book find (K key);

}
