package com.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.BookInfoDao;
import com.pojo.BookInfo;
import com.pojo.WhereParam;

public class BookInfoDaoImpl extends HibernateDaoSupport implements BookInfoDao {

	@Override
	public Integer findRows(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	@Override
	public List<BookInfo> getInfoList(String hql, Integer offset,
			Integer pageSize) {
		Session session = this.getSession();
		List<BookInfo> blist = null;
		try {
			Query query = session.createQuery(hql);
			blist = query.setFirstResult(offset).setMaxResults(pageSize).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
		}
		return blist;
	}

	@Override
	public List<BookInfo> getInfoList(String hql, Integer offset,
			Integer pageSize, WhereParam wp) {
		Session session = this.getSession();
		List<BookInfo> blist = null;
		try {
			Query query = session.createQuery(hql);
			if(null != wp){
				query.setProperties(wp);
			}
			blist = query.setFirstResult(offset).setMaxResults(pageSize).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
		}
		return blist;
	}

	@Override
	public void addInfo(BookInfo book) {
		this.getHibernateTemplate().save(book);
	}

	@Override
	public void delInfo(BookInfo book) {
		this.getHibernateTemplate().delete(book);

	}

	@Override
	public void updateInfo(BookInfo book) {
		this.getHibernateTemplate().update(book);
	}

	@Override
	public BookInfo selectInfoById(Integer bid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(BookInfo.class, bid);
	}

}
