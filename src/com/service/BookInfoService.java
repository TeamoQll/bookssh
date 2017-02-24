package com.service;

import java.util.List;

import com.pojo.BookInfo;
import com.pojo.WhereParam;

public interface BookInfoService {
	public Integer findRows();
	public Integer findRows(WhereParam wp);
	public List<BookInfo> getInfoList(Integer offset,Integer pageSize);
	public List<BookInfo> getInfoList(Integer offset,Integer pageSize,WhereParam wp);
	public void addInfo(BookInfo book);
	public void delInfo(Integer bid);
	public void updateInfo(BookInfo book);
	public BookInfo selectInfoById(Integer bid);
}
