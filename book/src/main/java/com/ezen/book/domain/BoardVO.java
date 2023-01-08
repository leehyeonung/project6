package com.ezen.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BoardVO {
	private int brd_num;
	private int brd_mem_num;
	private String brd_category;
	private String brd_title;
	private String brd_writer;
	private String brd_content;
	private String brd_regdate;
	private int brd_views;
	private int brd_cot_num;
}
