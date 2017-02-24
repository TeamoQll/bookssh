package com.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.BookTypeDao;
import com.pojo.BookType;

public class BookTypeDaoImpl extends HibernateDaoSupport implements BookTypeDao {

	@Override
	public List<BookType> getBookTypeList(String hql) {
		Session session = this.getSession();
		List<BookType> tlist = null;
		try {
			Query query = session.createQuery(hql);
			tlist = query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
		}
		return tlist;
	}

}
