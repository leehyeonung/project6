package com.ezen.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter

public class CommentVO {
	private int cot_num;
	private int cot_brd_num;
	private String cot_writer;
	private String cot_content;
	private String cot_regdate;
	
}