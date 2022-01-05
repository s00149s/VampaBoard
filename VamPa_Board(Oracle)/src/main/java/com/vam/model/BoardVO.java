package com.vam.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardVO {
	
	/*
	 * create table vam_board ( bno NUMBER, title varchar2(150) not null, content
	 * varchar2(2000) not null, writer varchar2(50) not null, regdate date default
	 * sysdate, updatedate date default sysdate, constraint pk_board PRIMARY
	 * key(bno) ); CREATE SEQUENCE BOARD_BNO_SEQ START WITH 1 INCREMENT BY 1
	 * MINVALUE 1 NOCYCLE;
	 * 
	 */
	
	 /* 게시판 번호 */
    private int bno;
    
    /* 게시판 제목 */
    private String title;
    
    /* 게시판 내용 */
    private String content;
    
    /* 게시판 작가 */
    private String writer;
    
    /* 등록 날짜 */
    private Date regdate;
    
	/* 수정 날짜 */
    private Date updateDate;
    
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

	
	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", updateDate=" + updateDate + "]";
	}
 
 

}
