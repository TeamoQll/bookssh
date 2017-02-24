package com.service.impl;

import java.util.List;

import com.dao.BookTypeDao;
import com.pojo.BookType;

public class BookTypeService implements com.service.BookTypeService {
	private BookTypeDao typeDao;
	@Override
	public List<BookType> getBookTypeList() {
		String hql = "from BookType";
		return this.typeDao.getBookTypeList(hql);
	}
	public BookTypeDao getTypeDao() {
		return typeDao;
	}
	public void setTypeDao(BookTypeDao typeDao) {
		this.typeDao = typeDao;
	}

}
