package com.ezen.book.repository;

import java.util.List;

import com.ezen.book.domain.CommentVO;

public interface CommentDAO {

	int insertComment(CommentVO cvo);

	int updateComment(CommentVO cvo);

	List<CommentVO> selectList(int cot_brd_num);

	int commentDelete(int cot_num);

	void removeComment(int brd_num);

}
