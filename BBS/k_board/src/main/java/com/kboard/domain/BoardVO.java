// VO = Value Object 테이블 컬럼명과 동일한 변수(자주 사용되는 데이터형)

package com.kboard.domain;

import java.util.Date;

public class BoardVO {
	// bno  int   not null  auto_increment,
	// title  varchar(50) not null,
	// content text   not null,
	// writer varchar(30) not null,
	// regDate timestamp default now(),
	// viewCnt int   default 0,
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
}