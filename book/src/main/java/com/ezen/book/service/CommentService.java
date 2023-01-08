package com.ezen.book.service;

import java.util.List;

import com.ezen.book.domain.CommentVO;

public interface CommentService {

	int register(CommentVO cvo);

	int modify(CommentVO cvo);

	List<CommentVO> getList(int cot_brd_num);

	int delete(int cot_num);

}
