package com.service.impl;

import java.util.List;

import com.dao.BookInfoDao;
import com.pojo.BookInfo;
import com.pojo.WhereParam;
import com.service.BookInfoService;

public class BookInfoServiceImpl implements BookInfoService {
	private BookInfoDao infoDao;
	@Override
	public Integer findRows() {
		String hql = "from BookInfo";
		return this.infoDao.findRows(hql);
	}

	@Override
	public Integer findRows(WhereParam wp) {
		StringBuffer hql = new StringBuffer("from BookInfo b where 1=1");
		if(null != wp.getSendName() && !"".equals(wp.getSendName())){
			hql.append(" and b.bookname like concat('%','"+wp.getSendName()+"','%')");
		}
		return this.infoDao.findRows(hql.toString());
	}

	@Override
	public List<BookInfo> getInfoList(Integer offset, Integer pageSize) {
		String hql = "from BookInfo b order by b.bookid desc";
		return this.infoDao.getInfoList(hql, offset, pageSize);
	}

	@Override
	public List<BookInfo> getInfoList(Integer offset, Integer pageSize,
			WhereParam wp) {
		StringBuffer hql = new StringBuffer(" from BookInfo b where 1=1");
		if(null != wp.getSendName() && !"".equals(wp.getSendName())){
			hql.append(" and b.bookname like concat('%',:sendName,'%')");
		}
		return this.infoDao.getInfoList(hql.toString(), offset, pageSize, wp);
	}

	@Override
	public void addInfo(BookInfo book) {
		this.infoDao.addInfo(book);

	}

	@Override
	public void delInfo(Integer bid) {
		BookInfo book = this.infoDao.selectInfoById(bid);
		if(book != null){
			this.infoDao.delInfo(book);
		}

	}

	@Override
	public void updateInfo(BookInfo book) {
		this.infoDao.updateInfo(book);

	}

	@Override
	public BookInfo selectInfoById(Integer bid) {
		// TODO Auto-generated method stub
		return this.infoDao.selectInfoById(bid);
	}

	
	
	
	
	
	
	
	public BookInfoDao getInfoDao() {
		return infoDao;
	}

	public void setInfoDao(BookInfoDao infoDao) {
		this.infoDao = infoDao;
	}

	
	
}
