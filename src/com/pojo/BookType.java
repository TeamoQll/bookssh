package com.pojo;


/**
 * BookType entity. @author MyEclipse Persistence Tools
 */

public class BookType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typename;

	// Constructors

	/** default constructor */
	public BookType() {
	}

	/** full constructor */
	public BookType(String typename) {
		this.typename = typename;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

}