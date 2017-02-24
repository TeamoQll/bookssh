package com.dao;

import java.util.List;

import com.pojo.BookType;

public interface BookTypeDao {
	public List<BookType> getBookTypeList(String hql);
}
