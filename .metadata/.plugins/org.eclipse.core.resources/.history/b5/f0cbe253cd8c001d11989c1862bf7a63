package com.ezen.book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ezen.book.domain.BoardVO;
import com.ezen.book.domain.PagingVO;

@Repository

public interface BoardDAO {

	List<BoardVO> selectBoardListPaging(PagingVO pvo);

	int searchTotalCount(PagingVO pvo);

	int selectTotalCount();
	
	List<BoardVO> selectBoardList();

	BoardVO detailBoard(int brd_num);

	BoardVO selectBoardDetail(int brd_num);

	int updateBoard(BoardVO bvo);

	void removerBoard(int brd_num);

	void register(BoardVO bvo);

	void countup(int brd_num);

	void countdown(int brd_num);
}
