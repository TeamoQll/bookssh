package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.BookTypeService;

public class BookTypeAction extends ActionSupport {
	private BookTypeService typeService;

	public BookTypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(BookTypeService typeService) {
		this.typeService = typeService;
	}
	
}
