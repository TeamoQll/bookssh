package com.dao;

import java.util.List;

import com.pojo.BookInfo;
import com.pojo.WhereParam;

public interface BookInfoDao {
	public Integer findRows(String hql);
	public List<BookInfo> getInfoList(String hql,Integer offset,Integer pageSize);
	public List<BookInfo> getInfoList(String hql,Integer offset,Integer pageSize,WhereParam wp);
	public void addInfo(BookInfo book);
	public void delInfo(BookInfo book);
	public void updateInfo(BookInfo book);
	public BookInfo selectInfoById(Integer bid);
}
