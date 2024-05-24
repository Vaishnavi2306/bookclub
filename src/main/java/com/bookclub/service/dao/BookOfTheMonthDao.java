package com.bookclub.service.dao;

import java.util.List;

import com.bookclub.model.BookOfTheMonth;
import com.bookclub.service.GenericCrudDao;

public interface BookOfTheMonthDao extends GenericCrudDao<BookOfTheMonth, String> {

	List<BookOfTheMonth> list(String key);

	boolean remove(String key);
}