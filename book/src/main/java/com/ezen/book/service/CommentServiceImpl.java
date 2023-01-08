package com.ezen.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ezen.book.domain.CommentVO;
import com.ezen.book.repository.CommentDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CommentServiceImpl implements CommentService {
	
	
	@Inject
	private CommentDAO cdao;

	@Override
	public int register(CommentVO cvo) {
		log.info("comment service check2");
		return cdao.insertComment(cvo);
	}

	@Override
	public int modify(CommentVO cvo) {
		log.info("comment modify service check2");
		return cdao.updateComment(cvo);
	}

	@Override
	public List<CommentVO> getList(int cot_brd_num) {
		// TODO Auto-generated method stub
		return cdao.selectList(cot_brd_num);
	}

	@Override
	public int delete(int cot_num) {
		// TODO Auto-generated method stub
		return cdao.commentDelete(cot_num);
	}
}
