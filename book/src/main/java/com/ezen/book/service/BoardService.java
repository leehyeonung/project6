package com.ezen.book.service;

import java.util.List;

import com.ezen.book.domain.BoardVO;
import com.ezen.book.domain.MemberVO;
import com.ezen.book.domain.PagingVO;

public interface BoardService {

	List<BoardVO> getList(PagingVO pvo);

	int getTotalCount(PagingVO pvo);

	int getTotalCount();

	List<BoardVO> getList();

	BoardVO getDetail(int brd_num);

	int modify(BoardVO bvo, MemberVO member);
}
