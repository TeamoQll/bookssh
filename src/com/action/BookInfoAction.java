package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pojo.BookInfo;
import com.pojo.BookType;
import com.pojo.WhereParam;
import com.service.BookInfoService;
import com.service.BookTypeService;
import com.sun.xml.internal.bind.unmarshaller.InfosetScanner;

public class BookInfoAction extends ActionSupport {
	private BookInfoService infoService;
	private BookTypeService typeService;
	private List<BookType> tlist;
	private BookInfo book;
	private Integer bid;
	private List<BookInfo> blist;
	private WhereParam wp;
	private Integer totalRows;
	private Integer totalPage;
	private Integer offset;
	private Integer pageSize = 3;
	private Integer curPage = 1;
	
	
	public String getInfoList(){
		if(wp != null){
			totalRows = this.infoService.findRows(wp);
			totalPage = (totalRows % pageSize == 0) ? (totalRows / pageSize) : (totalRows / pageSize)+1;
			offset = (curPage - 1)*pageSize;
			blist = this.infoService.getInfoList(offset, pageSize, wp);
		}else{
			totalRows = this.infoService.findRows();
			totalPage = (totalRows % pageSize == 0) ? (totalRows / pageSize) : (totalRows / pageSize)+1;
			offset = (curPage - 1)*pageSize;
			blist = this.infoService.getInfoList(offset, pageSize);
		}
		return SUCCESS;
	}
	
	public String addBook(){
		this.infoService.addInfo(book);
		return SUCCESS;
	}
	
	public String delBook(){
		this.infoService.delInfo(bid);
		return SUCCESS;
	}
	
	public String updateBook(){
		this.infoService.updateInfo(book);
		return SUCCESS;
	}
	
	public String findBookById(){
		tlist = this.typeService.getBookTypeList();
		book = this.infoService.selectInfoById(bid);
		return SUCCESS;
	}
	
	public String findType(){
		tlist = this.typeService.getBookTypeList();
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	public BookInfoService getInfoService() {
		return infoService;
	}
	public void setInfoService(BookInfoService infoService) {
		this.infoService = infoService;
	}
	
	public List<BookInfo> getBlist() {
		return blist;
	}
	public void setBlist(List<BookInfo> blist) {
		this.blist = blist;
	}
	public WhereParam getWp() {
		return wp;
	}
	public void setWp(WhereParam wp) {
		this.wp = wp;
	}
	public Integer getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurPage() {
		return curPage;
	}
	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public BookInfo getBook() {
		return book;
	}

	public void setBook(BookInfo book) {
		this.book = book;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public BookTypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(BookTypeService typeService) {
		this.typeService = typeService;
	}

	public List<BookType> getTlist() {
		return tlist;
	}

	public void setTlist(List<BookType> tlist) {
		this.tlist = tlist;
	}
	
	
}
