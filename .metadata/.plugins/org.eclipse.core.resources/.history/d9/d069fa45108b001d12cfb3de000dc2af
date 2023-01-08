package com.ezen.book.domain;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class PagingVO {

	private int pageNo; //현재 화면에 출력된 페이지네이션 번호
	private int qty; //한페이지당 보여줄 게시글 수
	
	private String type;
	private String keyword;
	
	public PagingVO() {
		this(1,10);
	}
	
	public PagingVO(int pageNo,int qty) {
		this.pageNo=pageNo;
		this.qty=qty;
	}
	
	public int getPageStart() { //시작번호 값 구하기
		return (this.pageNo-1)*qty; //DB에서 값을 LIMIT 첫 시작이 0 
	}
	
	public String[] getTypeToArray() {
		return this.type==null? new String[] {} : this.type.split("");
	}
}
