package board;

import java.sql.Date;

/*create table board(
num number primary key,
writer varchar2(20) not null,
pwd varchar2(20),
title varchar2(20),
board_date date,
content varchar2(50)
);
create sequence seq_board;
create table product(
num number primary key,
name varchar2(20) not null,
price number not null,
quantity number not null,
id varchar2(20) not null
);
create sequence seq_product;*/
public class Board {
	private int number;
	private String writer;
	private String pwd;
	private String title;
	private Date board_date;//ctrl+shift + o ->sql date∑Œ º±≈√ 
	private String content;
	public Board() {
		
	}
	public Board(int number, String writer, String pwd, String title, Date board_date, String content) {
		super();
		this.number = number;
		this.writer = writer;
		this.pwd = pwd;
		this.title = title;
		this.board_date = board_date;
		this.content = content;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [number=" + number + ", writer=" + writer + ", pwd=" + pwd + ", title=" + title + ", board_date="
				+ board_date + ", content=" + content + "]";
	}
}
