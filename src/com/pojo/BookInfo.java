package com.pojo;

import java.util.Date;

/**
 * BookInfo entity. @author MyEclipse Persistence Tools
 */

public class BookInfo implements java.io.Serializable {

	// Fields

	private Integer bookid;
	private String bookcde;
	private String bookname;
	private Integer booktype;
	private String bookauthor;
	private String publishpress;
	private Date publishdate;
	private Integer borrowed;
	private String createdby;
	private Date creationtime;
	private Date lastupdatetime;

	// Constructors

	/** default constructor */
	public BookInfo() {
	}

	/** minimal constructor */
	public BookInfo(String bookcde, String bookname, Integer booktype,
			String bookauthor, String publishpress, Date publishdate,
			Integer borrowed, String createdby, Date creationtime) {
		this.bookcde = bookcde;
		this.bookname = bookname;
		this.booktype = booktype;
		this.bookauthor = bookauthor;
		this.publishpress = publishpress;
		this.publishdate = publishdate;
		this.borrowed = borrowed;
		this.createdby = createdby;
		this.creationtime = creationtime;
	}

	/** full constructor */
	public BookInfo(String bookcde, String bookname, Integer booktype,
			String bookauthor, String publishpress, Date publishdate,
			Integer borrowed, String createdby, Date creationtime,
			Date lastupdatetime) {
		this.bookcde = bookcde;
		this.bookname = bookname;
		this.booktype = booktype;
		this.bookauthor = bookauthor;
		this.publishpress = publishpress;
		this.publishdate = publishdate;
		this.borrowed = borrowed;
		this.createdby = createdby;
		this.creationtime = creationtime;
		this.lastupdatetime = lastupdatetime;
	}

	// Property accessors

	public Integer getBookid() {
		return this.bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookcde() {
		return this.bookcde;
	}

	public void setBookcde(String bookcde) {
		this.bookcde = bookcde;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Integer getBooktype() {
		return this.booktype;
	}

	public void setBooktype(Integer booktype) {
		this.booktype = booktype;
	}

	public String getBookauthor() {
		return this.bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getPublishpress() {
		return this.publishpress;
	}

	public void setPublishpress(String publishpress) {
		this.publishpress = publishpress;
	}

	public Date getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}

	public Integer getBorrowed() {
		return this.borrowed;
	}

	public void setBorrowed(Integer borrowed) {
		this.borrowed = borrowed;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public Date getLastupdatetime() {
		return this.lastupdatetime;
	}

	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

}